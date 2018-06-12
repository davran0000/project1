package com.example.virus.cinemaline;

import android.app.Activity;
import android.nfc.Tag;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.example.virus.cinemaline.model.MainFeed;
import com.example.virus.cinemaline.model.children.Result;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class MainActivity extends Activity {
    TextView textView;
    Button bt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView = findViewById(R.id.tv_text);
        bt = findViewById(R.id.bt_text);
        bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                initializeRetrofitSetting();

            }
        });
    }

    private void initializeRetrofitSetting() {
        Retrofit retrofit = new Retrofit.Builder().baseUrl(Api.BASE_URL).
                addConverterFactory(GsonConverterFactory.create()).build();
        Api api = retrofit.create(Api.class);

        Call<MainFeed> call = api.getMovies();

        call.enqueue(new Callback<MainFeed>() {
            @Override
            public void onResponse(Call<MainFeed> call, Response<MainFeed> response) {
                ArrayList<Result> movieList =(ArrayList<Result>) response.body().getResultList();
                textView.setText("Hello World");
                Log.d("MAIN","onResponse "+response.toString());
                Log.d("MAIN","recieve"+response.body().toString());
            }

            @Override
            public void onFailure(Call<MainFeed> call, Throwable t) {
                textView.setText(t.getStackTrace().toString());
                Toast.makeText(getApplicationContext(),t.getMessage(),Toast.LENGTH_SHORT).show();
            }
        });

    }
}
