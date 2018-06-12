package com.example.virus.cinemaline.model.children;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Result {

    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("url")
    @Expose
    private String url;
    @SerializedName("image")
    @Expose
    private String image;
    @SerializedName("vote")
    @Expose
    private double vote;
    @SerializedName("count_vote")
    @Expose
    private String count_vote;
    @SerializedName("countries")
    @Expose
    private String countries;
    @SerializedName("actors")
    @Expose
    private String actor;
    @SerializedName("rejisser")
    @Expose
    private String rejisser;
    @SerializedName("premier_ua")
    @Expose
    private String premier_ua;
    @SerializedName("age_limit")
    @Expose
    private int age_limit;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getImage() {
        return image ;
    }

    public void setMovieImageList(String image) {
        this.image = image;
    }

    public double getVote() {
        return vote;
    }

    public void setVote(double vote) {
        this.vote = vote;
    }

    public String getCount_vote() {
        return count_vote;
    }

    public void setCount_vote(String count_vote) {
        this.count_vote = count_vote;
    }

    public String getCountries() {
        return countries;
    }

    public void setCountries(String countries) {
        this.countries = countries;
    }



    public String getPremier_ua() {
        return premier_ua;
    }

    public void setPremier_ua(String premier_ua) {
        this.premier_ua = premier_ua;
    }

    public int getAge_limit() {
        return age_limit;
    }

    public void setAge_limit(int age_limit) {
        this.age_limit = age_limit;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getActor() {
        return actor;
    }

    public void setActor(String actor) {
        this.actor = actor;
    }

    public String getRejisser() {
        return rejisser;
    }

    public void setRejisser(String rejisser) {
        this.rejisser = rejisser;
    }
}
