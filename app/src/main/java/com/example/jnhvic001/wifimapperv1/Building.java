package com.example.jnhvic001.wifimapperv1;

public class Building {

    private String bName;
    private double bLat;
    private double bLng;
    private int bStrength;

    public Building(String bName, double bLat, double bLng, int bStrength) {
        this.bName = bName;
        this.bLat = bLat;
        this.bLng = bLng;
        this.bStrength = bStrength;
    }

    public String getbName() {
        return bName;
    }

    public double getbLat() {
        return bLat;
    }

    public double getbLng() {
        return bLng;
    }

    public int getbStrength() {
        return bStrength;
    }

    public void setbName(String name) {
        this.bName = name;
    }

    public void setbLat(double lat) {
        this.bLat = lat;
    }

    public void setbLng(double lng) {
        this.bLng = lng;
    }

    public void setbStrength(int strength) {
        this.bStrength = strength;
    }
}