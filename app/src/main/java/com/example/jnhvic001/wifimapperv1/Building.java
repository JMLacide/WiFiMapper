package com.example.jnhvic001.wifimapperv1;

import android.graphics.Color;

import com.google.android.gms.maps.model.LatLng;

import java.util.ArrayList;
import java.util.List;

import static android.graphics.Color.rgb;

public class Building {

    protected String bName;
    protected ArrayList<Integer> average; //list to store all wifi values that will be used to computer average;
    protected List<LatLng> co_odrinates = new ArrayList<LatLng>(); //co-ordinates used in polygon
    protected int bStrength;
    protected int color;

    //Strength is initialized to zero since we have no data on it yet
    public Building(String bName, List<LatLng> co_odrinates) {
        this.bName = bName;
        this.co_odrinates = co_odrinates; //co-ordinates used in polygon
        this.bStrength = 0;
        this.color = 1;
    }

    public void setColour(int wifiStrength) {
        switch (wifiStrength) {
            case 1:
                color = rgb(192, 192, 192); //grey
                break;
            case 2:
                color = rgb(255, 102, 102);  //red
                break;

            case 3:
                color = rgb(255, 178, 102);  //orange
                break;
            case 4:
                color = rgb(255, 255, 0);  //yellow
                break;
            case 5:
                color = rgb(178, 255, 102);  //green
                break;
        }
    }

    public int getColor(){ return color; }


    public String getbName() {
        return bName;
    }

    //returns list of co-ordinates needed to draw polygon
    public List<LatLng> getPolyCoordinates() { return co_odrinates;}

    public int getbStrength() {
        return bStrength;
    }

    public void setbName(String name) {
        this.bName = name;
    }

    //add a lat and long to a building that will be used to draw polygon
    public void addLatLng(double lat, double lng) {
        this.co_odrinates.add(new LatLng(lat,lng));
    }

    public void updateAverage(int entry){
        average.add(entry);
        int sum = 0;
        for(Integer a: average){
            sum+=a;
        }
        this.bStrength = sum/average.size();

    }
}