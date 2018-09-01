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

        PolygonOptions cissy_gool_mall = new PolygonOptions()
                .add(new LatLng(-33.956777, 18.460736),
                        new LatLng(-33.956790, 18.460873),
                        new LatLng(-33.957069, 18.460849),
                        new LatLng(-33.957056, 18.460708))
                .fillColor(Color.rgb(192,192,192))
                .strokeColor(Color.blue(1));

        mMap.addPolygon(cissy_gool_mall);

        PolygonOptions molly_blackburn2 = new PolygonOptions()
                .add(new LatLng(-33.957106, 18.460362),
                        new LatLng(-33.957169, 18.460863),
                        new LatLng(-33.957381, 18.460816),
                        new LatLng(-33.957326, 18.460331))
                .fillColor(Color.rgb(192,192,192))
                .strokeColor(Color.blue(1));

        mMap.addPolygon(molly_blackburn2);

        PolygonOptions molly_blackburn = new PolygonOptions()
                .add(new LatLng(-33.957188, 18.460867),
                        new LatLng(-33.957232, 18.461190),
                        new LatLng(-33.957455, 18.461150),
                        new LatLng(-33.957411, 18.460815))
                .fillColor(Color.rgb(192,192,192))
                .strokeColor(Color.blue(1));

        mMap.addPolygon(molly_blackburn);

        PolygonOptions memorial_hall = new PolygonOptions()
                .add(new LatLng(-33.957501, 18.460549),
                        new LatLng(-33.957564, 18.460888),
                        new LatLng(-33.957800, 18.460850),
                        new LatLng(-33.957736, 18.460488))
                .fillColor(Color.rgb(255,255,0))
                .strokeColor(Color.blue(1));

        mMap.addPolygon(memorial_hall);

        PolygonOptions botany = new PolygonOptions()
                .add(new LatLng(-33.956129, 18.461560),
                        new LatLng(-33.956141, 18.461836),
                        new LatLng(-33.956796, 18.461778),
                        new LatLng(-33.956783, 18.461521))
                .fillColor(Color.rgb(192,192,192))
                .strokeColor(Color.blue(1));

        mMap.addPolygon(botany);

        PolygonOptions zoology = new PolygonOptions()
                .add(new LatLng(-33.955929, 18.460946),
                        new LatLng(-33.955926, 18.461284),
                        new LatLng(-33.956532, 18.461260),
                        new LatLng(-33.956514, 18.460943))
                .fillColor(Color.rgb(255,255,0))
                .strokeColor(Color.blue(1));

        mMap.addPolygon(zoology);

        PolygonOptions rw_james = new PolygonOptions()
                .add(new LatLng(-33.955274, 18.461557),
                        new LatLng(-33.955270, 18.461838),
                        new LatLng(-33.955963, 18.461838),
                        new LatLng(-33.955961, 18.461559))
                .fillColor(Color.rgb(192,192,192))
                .strokeColor(Color.blue(1));

        mMap.addPolygon(rw_james);

        PolygonOptions chris_hani = new PolygonOptions()
                .add(new LatLng(-33.955666, 18.460962),
                        new LatLng(-33.955670, 18.461297),
                        new LatLng(-33.955877, 18.461302),
                        new LatLng(-33.955875, 18.460951))
                .fillColor(Color.rgb(255,255,0))
                .strokeColor(Color.blue(1));

        mMap.addPolygon(chris_hani);


        PolygonOptions molecularbiology = new PolygonOptions()
                .add(new LatLng(-33.955139, 18.460789),
                        new LatLng(-33.955132, 18.461031),
                        new LatLng(-33.954972, 18.461025),
                        new LatLng(-33.954973, 18.461292),
                        new LatLng(-33.955630, 18.461302),
                        new LatLng(-33.955637, 18.460802))
                .fillColor(Color.rgb(192,192,192))
                .strokeColor(Color.blue(1));

        mMap.addPolygon(molecularbiology);

        PolygonOptions beatie = new PolygonOptions()
                .add(new LatLng(-33.958714, 18.461069),
                        new LatLng(-33.958784, 18.461343),
                        new LatLng(-33.959334, 18.461141),
                        new LatLng(-33.959262, 18.460865))
                .fillColor(Color.rgb(192,192,192))
                .strokeColor(Color.blue(1));

        mMap.addPolygon(beatie);

        PolygonOptions architecture_building = new PolygonOptions()
                .add(new LatLng(-33.959437, 18.460787),
                        new LatLng(-33.959526, 18.461058),
                        new LatLng(-33.960131, 18.460757),
                        new LatLng(-33.960039, 18.460486))
                .fillColor(Color.rgb(255,255,0))
                .strokeColor(Color.blue(1));

        mMap.addPolygon(architecture_building);

        PolygonOptions leslie_social = new PolygonOptions()
                .add(new LatLng(-33.959093, 18.460094),
                        new LatLng(-33.959249, 18.460558),
                        new LatLng(-33.959791, 18.460289),
                        new LatLng(-33.959631, 18.459816))
                .fillColor(Color.rgb(192,192,192))
                .strokeColor(Color.blue(1));

        mMap.addPolygon(leslie_social);

        PolygonOptions geo_building = new PolygonOptions()
                .add(new LatLng(-33.958809, 18.460349),
                        new LatLng(-33.958897, 18.460720),
                        new LatLng(-33.959113, 18.460638),
                        new LatLng(-33.959012, 18.460269))
                .fillColor(Color.rgb(255,255,0))
                .strokeColor(Color.blue(1));

        mMap.addPolygon(geo_building);

        PolygonOptions EM_building = new PolygonOptions()
                .add(new LatLng(-33.958230, 18.460603),
                        new LatLng(-33.958308, 18.460941),
                        new LatLng(-33.958840, 18.460760),
                        new LatLng(-33.958764, 18.460423))
                .fillColor(Color.rgb(192,192,192))
                .strokeColor(Color.blue(1));

        mMap.addPolygon(EM_building);

        PolygonOptions menzies = new PolygonOptions()
                .add(new LatLng(-33.958404, 18.460061),
                        new LatLng(-33.958439, 18.460229),
                        new LatLng(-33.958953, 18.460071),
                        new LatLng(-33.958912, 18.459883))
                .fillColor(Color.rgb(255,255,0))
                .strokeColor(Color.blue(1));

        mMap.addPolygon(menzies);

        PolygonOptions snape = new PolygonOptions()
                .add(new LatLng(-33.958233, 18.459594),
                        new LatLng(-33.958320, 18.459919),
                        new LatLng(-33.958992, 18.459683),
                        new LatLng(-33.959089, 18.459423),
                        new LatLng(-33.959089, 18.459423),
                        new LatLng(-33.958393, 18.459676),
                        new LatLng(-33.958360, 18.459553)
                        )
                .fillColor(Color.rgb(192,192,192))
                .strokeColor(Color.blue(1));

        mMap.addPolygon(snape);

        PolygonOptions leslie_commerce = new PolygonOptions()
                .add(new LatLng(-33.958981, 18.459767),
                        new LatLng(-33.959059, 18.459993),
                        new LatLng(-33.959592, 18.459722),
                        new LatLng(-33.959520, 18.459497))
                .fillColor(Color.rgb(255,255,0))
                .strokeColor(Color.blue(1));

        mMap.addPolygon(leslie_commerce);

        PolygonOptions alex = new PolygonOptions()
                .add(new LatLng(-33.959778, 18.459802),
                        new LatLng(-33.959940, 18.460247),
                        new LatLng(-33.960257, 18.460065),
                        new LatLng(-33.960096, 18.459632))
                .fillColor(Color.rgb(255,255,0))
                .strokeColor(Color.blue(1));

        mMap.addPolygon(alex);


        PolygonOptions kaplan = new PolygonOptions()
                .add(new LatLng(-33.959811, 18.459365),
                        new LatLng(-33.959875, 18.459553),
                        new LatLng(-33.960068, 18.459453),
                        new LatLng(-33.960001, 18.459269))
                .fillColor(Color.rgb(255,255,0))
                .strokeColor(Color.blue(1));

        mMap.addPolygon(kaplan);

        PolygonOptions engineering = new PolygonOptions()
                .add(new LatLng(-33.958314, 18.459190),
                        new LatLng(-33.958367, 18.459458),
                        new LatLng(-33.959013, 18.459254),
                        new LatLng(-33.958948, 18.458974))
                .fillColor(Color.rgb(255,255,0))
                .strokeColor(Color.blue(1));

        mMap.addPolygon(engineering);

        PolygonOptions pd_pahn = new PolygonOptions()
                .add(new LatLng(-33.955429, 18.460238),
                        new LatLng(-33.955421, 18.460731),
                        new LatLng(-33.956447, 18.460738),
                        new LatLng(-33.956434, 18.460004),
                        new LatLng(-33.956079, 18.460011)
                        )
                .fillColor(Color.rgb(255,255,0))
                .strokeColor(Color.blue(1));
        mMap.addPolygon(pd_pahn);

        PolygonOptions hoeri = new PolygonOptions()
                .add(new LatLng(-33.956490, 18.459931),
                        new LatLng(-33.956518, 18.460327),
                        new LatLng(-33.956829, 18.460294),
                        new LatLng(-33.956872, 18.460168),
                        new LatLng(-33.956844, 18.459929)

                )
                .fillColor(Color.rgb(255,255,0))
                .strokeColor(Color.blue(1));
        mMap.addPolygon(hoeri);

        PolygonOptions library = new PolygonOptions()
                .add(new LatLng(-33.957375, 18.460286),
                        new LatLng(-33.957409, 18.460528),
                        new LatLng(-33.957867, 18.460433),
                        new LatLng(-33.957909, 18.460682),
                        new LatLng(-33.958138, 18.460620),
                        new LatLng(-33.958057, 18.460148)

                )
                .fillColor(Color.rgb(255,255,0))
                .strokeColor(Color.blue(1));
        mMap.addPolygon(library);

        PolygonOptions egs_building = new PolygonOptions()
                .add(new LatLng(-33.956994, 18.459729),
                        new LatLng(-33.957052, 18.460231),
                        new LatLng(-33.957371, 18.460193),
                        new LatLng(-33.957323, 18.459685)

                )
                .fillColor(Color.rgb(255,255,0))
                .strokeColor(Color.blue(1));
        mMap.addPolygon(egs_building);

        //PolygonOptions open_space1 = new PolygonOptions()
                //.add(new LatLng(-33.954735, 18.460311),
                        //new LatLng(-33.954982, 18.461411),
                        //new LatLng(-33.955239, 18.462072),
                        //new LatLng(-33.955978, 18.461995),
                        //new LatLng(-33.955909, 18.460788)
               // )
                //.addHole(molecularbiology.getPoints())
                //.fillColor(Color.rgb(255,200,100))
                //.strokeColor(Color.blue(1));

       // mMap.addPolygon(open_space1);



    }
}