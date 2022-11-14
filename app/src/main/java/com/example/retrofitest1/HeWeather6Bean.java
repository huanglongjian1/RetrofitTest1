package com.example.retrofitest1;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import org.json.JSONException;
import org.json.JSONObject;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

public class HeWeather6Bean {
    /**
     * basic : {"cid":"CN101190601","location":"扬州","parent_city":"扬州","admin_area":"江苏省","cnty":"中国","lat":"32.393158","lon":"119.421005","tz":"+8.00"}
     * update : {"loc":"2022-11-15 02:47","utc":"2022-11-14 18:47"}
     * status : ok
     * now : {"cloud":"0","cond_code":"100","cond_txt":"晴","fl":"4","hum":"99","pcpn":"0.0","pres":"1020","tmp":"6","vis":"2","wind_deg":"274","wind_dir":"西风","wind_sc":"1","wind_spd":"3"}
     */

    private BasicBean basic;
    private UpdateBean update;
    private String status;
    private NowBean now;

    public static HeWeather6Bean objectFromData(String str) {

        return new Gson().fromJson(str, HeWeather6Bean.class);
    }

    public static HeWeather6Bean objectFromData(String str, String key) {

        try {
            JSONObject jsonObject = new JSONObject(str);

            return new Gson().fromJson(jsonObject.getString(str), HeWeather6Bean.class);
        } catch (JSONException e) {
            e.printStackTrace();
        }

        return null;
    }

    public static List<HeWeather6Bean> arrayHeWeather6BeanFromData(String str) {

        Type listType = new TypeToken<ArrayList<HeWeather6Bean>>() {
        }.getType();

        return new Gson().fromJson(str, listType);
    }

    public static List<HeWeather6Bean> arrayHeWeather6BeanFromData(String str, String key) {

        try {
            JSONObject jsonObject = new JSONObject(str);
            Type listType = new TypeToken<ArrayList<HeWeather6Bean>>() {
            }.getType();

            return new Gson().fromJson(jsonObject.getString(str), listType);

        } catch (JSONException e) {
            e.printStackTrace();
        }

        return new ArrayList();


    }

    public BasicBean getBasic() {
        return basic;
    }

    public void setBasic(BasicBean basic) {
        this.basic = basic;
    }

    public UpdateBean getUpdate() {
        return update;
    }

    public void setUpdate(UpdateBean update) {
        this.update = update;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public NowBean getNow() {
        return now;
    }

    public void setNow(NowBean now) {
        this.now = now;
    }
}
