package com.example.retrofitest1;

public class HeWeather6Bean {
    /**
     * basic : {"cid":"CN101190601","location":"扬州","parent_city":"扬州","admin_area":"江苏省","cnty":"中国","lat":"32.393158","lon":"119.421005","tz":"+8.00"}
     * update : {"loc":"2022-11-15 04:07","utc":"2022-11-14 20:07"}
     * status : ok
     * now : {"cloud":"10","cond_code":"100","cond_txt":"晴","fl":"3","hum":"99","pcpn":"0.0","pres":"1020","tmp":"5","vis":"1","wind_deg":"359","wind_dir":"北风","wind_sc":"1","wind_spd":"4"}
     */

    private BasicBean basic;
    private UpdateBean update;
    private String status;
    private NowBean now;

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
