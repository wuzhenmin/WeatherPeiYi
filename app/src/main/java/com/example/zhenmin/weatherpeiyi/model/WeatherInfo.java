package com.example.zhenmin.weatherpeiyi.model;

import java.io.Serializable;

/**
 * Created by zhenmin on 2015/12/21.
 */
public class WeatherInfo implements Serializable{
    private String sender;
    private String sendTime;
    private String sendDate;
    private String cityName;
    private String weatherToday;
    private String weatherTomorrow;

    public String getSender() {
        return sender;
    }

    public void setSender(String sender) {
        this.sender = sender;
    }

    public String getSendTime() {
        return sendTime;
    }

    public void setSendTime(String sendTime) {
        this.sendTime = sendTime;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public String getWeatherToday() {
        return weatherToday;
    }

    public void setWeatherToday(String weatherToday) {
        this.weatherToday = weatherToday;
    }

    public String getWeatherTomorrow() {
        return weatherTomorrow;
    }

    public void setWeatherTomorrow(String weatherTomorrow) {
        this.weatherTomorrow = weatherTomorrow;
    }

    public String getSendDate() {
        return sendDate;
    }

    public void setSendDate(String sendDate) {
        this.sendDate = sendDate;
    }
}
