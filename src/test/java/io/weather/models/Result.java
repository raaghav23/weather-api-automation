package io.weather.models;

import com.google.gson.annotations.Expose;

import java.util.List;

public class Result {

    @Expose
    private String lat = "";

    public String getLat() {
        return lat;
    }

    public void setLat(String lat) {
        this.lat = lat;
    }
}

