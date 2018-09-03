package com.example.jnhvic001.wifimapperv1;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import static android.graphics.Color.rgb;

public class Building {

    protected String bName;
    protected List<Integer> wifiStrength; //list to store all wifi values that will be used to computer average;
    protected List<Date> wifiTime; //co-ordinates used in polygon
    protected int numberOfValues;
    protected int current_average;

    public Building(String bName, List<Integer> wifiStrength, List<Date> wifiTime, int numberOfValues, int current_average) {
        this.bName = bName;
        this.wifiStrength = wifiStrength;
        this.wifiTime = wifiTime;
        this.numberOfValues = numberOfValues;
        this.current_average = current_average;
    }

    public String getbName() {
        return bName;
    }

    public void setbName(String bName) {
        this.bName = bName;
    }

    public List<Integer> getWifiStrength() {
        return wifiStrength;
    }

    public void setWifiStrength(List<Integer> wifiStrength) {
        this.wifiStrength = wifiStrength;
    }

    public List<Date> getWifiTime() {
        return wifiTime;
    }

    public void setWifiTime(List<Date> wifiTime) {
        this.wifiTime = wifiTime;
    }

    public int getNumberOfValues() {
        return numberOfValues;
    }

    public void setNumberOfValues(int numberOfValues) {
        this.numberOfValues = numberOfValues;
    }

    public int getCurrent_average() {
        return current_average;
    }

    public void setCurrent_average(int current_average) {
        this.current_average = current_average;
    }
}