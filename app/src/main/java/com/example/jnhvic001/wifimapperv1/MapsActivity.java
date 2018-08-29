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
import java.util.List;

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

        buildingMarkers.addMarker(googleMap);
/*
        Marker m1 = googleMap.addMarker(new MarkerOptions()
                .position(new LatLng(-33.957673, 18.460735))
                .anchor(0.5f, 0.5f)
                .title("Memorial Hall")
                .snippet("Wi-Fi Level: 3")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_YELLOW)));


        Marker m2 = googleMap.addMarker(new MarkerOptions()
                .position(new LatLng(-33.957273,18.461574))
                .anchor(0.5f, 0.5f)
                .title("Maths Building")
                .snippet("Wi-Fi Level: 5")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN)));


        Marker m3 = googleMap.addMarker(new MarkerOptions()
                .position(new LatLng(-33.956242,18.461038))
                .anchor(0.5f, 0.5f)
                .title("John Day Building")
                .snippet("Wi-Fi Level: 4")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_CYAN)));

        Marker m4 = googleMap.addMarker(new MarkerOptions()
                .position(new LatLng(-33.956800, 18.461114))
                .anchor(0.5f, 0.5f)
                .title("Computer Science Building")
                .snippet("Wi-Fi Level: 2")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_RED)));


        Marker m5 = googleMap.addMarker(new MarkerOptions()
                .position(new LatLng(-33.956894, 18.460581))
                .anchor(0.5f, 0.5f)
                .title("Steve Biko Building")
                .snippet("Wi-Fi Level: 5")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_RED)));
*/
        // Instantiates a new Polygon object and adds points to define a rectangle
        PolygonOptions csc = new PolygonOptions()
                .add(new LatLng(-33.956551, 18.460927),
                        new LatLng(-33.956585, 18.461268),
                        new LatLng(-33.957137, 18.461209),
                        new LatLng(-33.957103, 18.460860))
                .fillColor(Color.rgb(178,255,102))
                .strokeColor(Color.blue(1));
        //Displays polygon on mMap
       mMap.addPolygon(csc);

        PolygonOptions stevebiko = new PolygonOptions()
                .add(new LatLng(-33.956667, 18.460479),
                        new LatLng(-33.956692, 18.460706),
                        new LatLng(-33.957075, 18.460658),
                        new LatLng(-33.957065, 18.460427))
                .fillColor(Color.rgb(255,102,102))
                .strokeColor(Color.blue(1));

       mMap.addPolygon(stevebiko);

        PolygonOptions math = new PolygonOptions()
                .add(new LatLng(-33.956981, 18.461489),
                        new LatLng(-33.957016, 18.461770),
                        new LatLng(-33.957517, 18.461685),
                        new LatLng(-33.957481, 18.461397))
                .fillColor(Color.rgb(255,255,0))
                .strokeColor(Color.blue(1));

        mMap.addPolygon(math);

        PolygonOptions ac_jordan = new PolygonOptions()
                .add(new LatLng(-33.958053, 18.461277),
                        new LatLng(-33.958109, 18.461556),
                        new LatLng(-33.958593, 18.461406),
                        new LatLng(-33.958538, 18.461135))
                .fillColor(Color.rgb(255,178,102))
                .strokeColor(Color.blue(1));

        mMap.addPolygon(ac_jordan);

        PolygonOptions jagger_library = new PolygonOptions()
                .add(new LatLng(-33.957922, 18.460712),
                        new LatLng(-33.957977, 18.461027),
                        new LatLng(-33.958195, 18.460958),
                        new LatLng(-33.958144, 18.460641))
                .fillColor(Color.rgb(192,192,192))
                .strokeColor(Color.blue(1));

        mMap.addPolygon(jagger_library);


    }
}