package com.example.retrofitest1;

import com.example.retrofitest1.Basic;
import com.example.retrofitest1.Now;
import com.example.retrofitest1.Update;
import com.google.gson.annotations.SerializedName;

public class HeWeather6 {
    @SerializedName("basic")
    private Basic basic;
    @SerializedName("update")
    private Update update;
    @SerializedName("status")
    private String status;
    @SerializedName("now")
    private Now now;

    public void setBasic(Basic basic) {
        this.basic = basic;
    }

    public Basic getBasic() {
        return basic;
    }

    public void setUpdate(Update update) {
        this.update = update;
    }

    public Update getUpdate() {
        return update;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getStatus() {
        return status;
    }

    public void setNow(Now now) {
        this.now = now;
    }

    public Now getNow() {
        return now;
    }

}