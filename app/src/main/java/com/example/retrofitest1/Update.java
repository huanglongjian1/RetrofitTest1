package com.example.retrofitest1;

import com.google.gson.annotations.SerializedName;

import java.util.Date;

public class Update {
    @SerializedName("loc")
    private Date loc;
    @SerializedName("utc")
    private Date utc;
    public void setLoc(Date loc) {
        this.loc = loc;
    }
    public Date getLoc() {
        return loc;
    }

    public void setUtc(Date utc) {
        this.utc = utc;
    }
    public Date getUtc() {
        return utc;
    }

}