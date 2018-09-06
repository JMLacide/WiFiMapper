package com.example.jnhvic001.wifimapperv1;

import android.app.Activity;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import android.os.Build;
import android.provider.Settings;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.ActivityCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;

import com.google.android.gms.maps.model.PolygonOptions;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;
import com.google.maps.android.PolyUtil;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Map;

public class HomeScreen extends AppCompatActivity implements AdapterView.OnItemSelectedListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_screen);

        Button btn = findViewById(R.id.button1);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(HomeScreen.this, MapsActivity.class));
            }

        });

        //Loading Spinner for Filter options.
        Spinner spinner = findViewById(R.id.planets_spinner);
// Create an ArrayAdapter using the string array and a default spinner layout

        // Custom choices
        List<CharSequence> choices = new ArrayList<CharSequence>();
        choices.add("All Time");
        choices.add("Last 7 Days");
        choices.add("Last 30 Days");

        // Create an ArrayAdapter with custom choices
        ArrayAdapter<CharSequence> adapter = new ArrayAdapter<CharSequence>(this, android.R.layout.simple_spinner_item, choices);

        // Specify the layout to use when the list of choices appears
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
// Apply the adapter to the spinner
        spinner.setAdapter(adapter);
        spinner.setOnItemSelectedListener(this);

    }
    public void readData() {

        FirebaseDatabase database = FirebaseDatabase.getInstance();
        final DatabaseReference myRef = database.getReference("Areas");
        myRef.addListenerForSingleValueEvent(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String out ="";
                TextView newtext = findViewById(R.id.text_view_id);
                //Iterates through each Area
                for (DataSnapshot child : dataSnapshot.getChildren()) {

                    //out = out + child.getValue().toString() + "/n";
                    //Building building = snapshot.getValue(Building.class);
                }
                newtext.setText(out);
            }

            @Override
            public void onCancelled(DatabaseError databaseError) {
            }
        });
    }

    ////***********************************************************************8

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

        readData();

    }


    @Override
    public void onNothingSelected(AdapterView<?> adapterView) {

    }

}