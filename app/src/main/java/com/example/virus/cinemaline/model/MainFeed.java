package com.example.virus.cinemaline.model;

import com.example.virus.cinemaline.model.children.Result;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class MainFeed {
    @SerializedName("succes")
    @Expose
    private boolean success;
    @SerializedName("count")
    @Expose
    private int count;
    @SerializedName("result")
    @Expose
    private List<Result> resultList;

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public List<Result> getResultList() {
        return resultList;
    }

    public void setResultList(List<Result> resultList) {
        this.resultList = resultList;
    }
}