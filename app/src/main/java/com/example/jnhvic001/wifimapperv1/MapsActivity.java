package com.example.jnhvic001.wifimapperv1;

import android.Manifest;
import android.content.Context;
import android.content.pm.PackageManager;
import android.graphics.Color;
import android.location.Address;
import android.location.Geocoder;
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import android.support.v4.app.ActivityCompat;
import android.support.v4.app.FragmentActivity;
import android.os.Bundle;
import android.widget.Toast;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.Marker;
import com.google.android.gms.maps.model.MarkerOptions;
import com.google.android.gms.maps.model.Polygon;
import com.google.android.gms.maps.model.PolygonOptions;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import static android.graphics.Color.rgb;

public class MapsActivity extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maps);
        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);

        // Get the Wifi Strength received by the mobile device and display on a scale of 1 to 5
        // 5 being the highest wifi Strength
        WifiManager wifiManager = (WifiManager) this.getApplicationContext().getSystemService(Context.WIFI_SERVICE);
        int numberOfLevels = 5;
        WifiInfo wifiInfo = wifiManager.getConnectionInfo();
        int level = WifiManager.calculateSignalLevel(wifiInfo.getRssi(), numberOfLevels);

        CharSequence text = "Current Wi-Fi Level: " + level;
        Toast.makeText(getApplicationContext(),text,Toast.LENGTH_LONG).show();

        // Write the wifi strength to the database
        FirebaseDatabase database = FirebaseDatabase.getInstance();
        DatabaseReference myRef = database.getReference("message");
        myRef.setValue(Integer.toString(level));
    }
    /**
     * Manipulates the map once available.
     * This callback is triggered when the map is ready to be used.
     * This is where we can add markers or lines, add listeners or move the camera. In this case,
     * we just add a marker near Sydney, Australia.
     * If Google Play services is not installed on the device, the user will be prompted to install
     * it inside the SupportMapFragment. This method will only be triggered once the user has
     * installed Google Play services and returned to the app.
     */
    @Override
    public void onMapReady(GoogleMap googleMap) {

        // Location of Jameson Stairs, for zooming purpose.
        mMap = googleMap;
        LatLng uct = new LatLng(-33.957731,18.461170 );
        float zoomLevel = 17.0f;
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(uct, zoomLevel));

        BuildingMarkers buildingMarkers = new BuildingMarkers();

        //List<Building> buildings = buildingMarkers.initBuildings(); //create array of building objects
        ArrayList<PolygonOptions> buildingAreas = buildingMarkers.getPolygons(); //ArrayList of all Polygons shapes
        ArrayList<PolygonOptions> outerAreas = buildingMarkers.getOutsideArea(buildingAreas); //ArrayList of all Polygons shapes

        //iterate through polygonOptions arrayList and display all polygons on the mMap object
        for(PolygonOptions p: buildingAreas){
            mMap.addPolygon(p);
        }
        for(PolygonOptions j: outerAreas) {
            mMap.addPolygon(j);
        }
    }
}