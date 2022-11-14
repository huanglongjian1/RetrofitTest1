package com.example.retrofitest1;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import org.json.JSONException;
import org.json.JSONObject;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

public class UpdateBean {
    /**
     * loc : 2022-11-15 02:47
     * utc : 2022-11-14 18:47
     */

    private String loc;
    private String utc;

    public static UpdateBean objectFromData(String str) {

        return new Gson().fromJson(str, UpdateBean.class);
    }

    public static UpdateBean objectFromData(String str, String key) {

        try {
            JSONObject jsonObject = new JSONObject(str);

            return new Gson().fromJson(jsonObject.getString(str), UpdateBean.class);
        } catch (JSONException e) {
            e.printStackTrace();
        }

        return null;
    }

    public static List<UpdateBean> arrayUpdateBeanFromData(String str) {

        Type listType = new TypeToken<ArrayList<UpdateBean>>() {
        }.getType();

        return new Gson().fromJson(str, listType);
    }

    public static List<UpdateBean> arrayUpdateBeanFromData(String str, String key) {

        try {
            JSONObject jsonObject = new JSONObject(str);
            Type listType = new TypeToken<ArrayList<UpdateBean>>() {
            }.getType();

            return new Gson().fromJson(jsonObject.getString(str), listType);

        } catch (JSONException e) {
            e.printStackTrace();
        }

        return new ArrayList();


    }

    public String getLoc() {
        return loc;
    }

    public void setLoc(String loc) {
        this.loc = loc;
    }

    public String getUtc() {
        return utc;
    }

    public void setUtc(String utc) {
        this.utc = utc;
    }
}
