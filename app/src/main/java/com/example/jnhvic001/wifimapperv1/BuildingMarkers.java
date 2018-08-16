package com.example.jnhvic001.wifimapperv1;

import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

import java.util.ArrayList;

public class BuildingMarkers {

    GoogleMap mMap;
    ArrayList<Building> buildings = new ArrayList<>();

    public BuildingMarkers() {
        Building building = new Building("New Lecture Theatre",-33.960188,18.459757,5);
        buildings.add(building);
    }

    public void addMarker(GoogleMap googleMap) {

        this.mMap = googleMap;

        for (Building x : buildings) {

            switch (x.getbStrength()) {
                case 1:
                    mMap.addMarker(new MarkerOptions()
                            .position(new LatLng(x.getbLat(), x.getbLng()))
                            .anchor(0.5f, 0.5f)
                            .title(x.getbName())
                            .snippet("Wi-Fi Level: " + x.getbStrength())
                            .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_RED)));
                case 2:
                    mMap.addMarker(new MarkerOptions()
                            .position(new LatLng(x.getbLat(), x.getbLng()))
                            .anchor(0.5f, 0.5f)
                            .title(x.getbName())
                            .snippet("Wi-Fi Level: " + x.getbStrength())
                            .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_ORANGE)));
                case 3:
                    mMap.addMarker(new MarkerOptions()
                            .position(new LatLng(x.getbLat(), x.getbLng()))
                            .anchor(0.5f, 0.5f)
                            .title(x.getbName())
                            .snippet("Wi-Fi Level: " + x.getbStrength())
                            .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_YELLOW)));
                case 4:
                    mMap.addMarker(new MarkerOptions()
                            .position(new LatLng(x.getbLat(), x.getbLng()))
                            .anchor(0.5f, 0.5f)
                            .title(x.getbName())
                            .snippet("Wi-Fi Level: " + x.getbStrength())
                            .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_CYAN)));
                case 5:
                    mMap.addMarker(new MarkerOptions()
                            .position(new LatLng(x.getbLat(), x.getbLng()))
                            .anchor(0.5f, 0.5f)
                            .title(x.getbName())
                            .snippet("Wi-Fi Level: " + x.getbStrength())
                            .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN)));
            }
        }
    }
}