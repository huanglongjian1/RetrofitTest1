package com.example.retrofitest1;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class JsonRootBean {
    @SerializedName("HeWeather6")
    private List<HeWeather6> HeWeather6;
    public void setHeWeather6(List<HeWeather6> HeWeather6) {
        this.HeWeather6 = HeWeather6;
    }
    public List<HeWeather6> getHeWeather6() {
        return HeWeather6;
    }

}
