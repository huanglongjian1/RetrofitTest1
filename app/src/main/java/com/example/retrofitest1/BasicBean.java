package com.example.retrofitest1;

public class BasicBean {
    /**
     * cid : CN101190601
     * location : 扬州
     * parent_city : 扬州
     * admin_area : 江苏省
     * cnty : 中国
     * lat : 32.393158
     * lon : 119.421005
     * tz : +8.00
     */

    private String cid;
    private String location;
    private String parent_city;
    private String admin_area;
    private String cnty;
    private String lat;
    private String lon;
    private String tz;

    public String getCid() {
        return cid;
    }

    public void setCid(String cid) {
        this.cid = cid;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getParent_city() {
        return parent_city;
    }

    public void setParent_city(String parent_city) {
        this.parent_city = parent_city;
    }

    public String getAdmin_area() {
        return admin_area;
    }

    public void setAdmin_area(String admin_area) {
        this.admin_area = admin_area;
    }

    public String getCnty() {
        return cnty;
    }

    public void setCnty(String cnty) {
        this.cnty = cnty;
    }

    public String getLat() {
        return lat;
    }

    public void setLat(String lat) {
        this.lat = lat;
    }

    public String getLon() {
        return lon;
    }

    public void setLon(String lon) {
        this.lon = lon;
    }

    public String getTz() {
        return tz;
    }

    public void setTz(String tz) {
        this.tz = tz;
    }
}
