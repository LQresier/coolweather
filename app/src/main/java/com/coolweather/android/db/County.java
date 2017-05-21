package com.coolweather.android.db;

import org.litepal.crud.DataSupport;

/**
 * Created by Administrator on 2017/5/21.
 */

public class County extends DataSupport {
    private int id;
    private String countyName;           //县名
    private String weatherId;            //县对应的天气id
    private int cityId;                  //当前县所属市的id

    public void setId(int id) {
        this.id = id;
    }

    public void setCountyName(String countyName) {
        this.countyName = countyName;
    }

    public void setWeatherId(String weatherId) {
        this.weatherId = weatherId;
    }

    public void setCityId(int cityId) {
        this.cityId = cityId;
    }

    public int getCityId() {

        return cityId;
    }

    public String getWeatherId() {

        return weatherId;
    }

    public String getCountyName() {

        return countyName;
    }

    public int getId() {

        return id;
    }
}
