package com.omrobbie.abcbuilder;

import android.os.Bundle;
import android.support.v4.app.FragmentActivity;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

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
        mMap = googleMap;

        // Add a marker in Sydney and move the camera
        LatLng property1 = new LatLng(-8.655966, 115.234964);
        mMap.addMarker(new MarkerOptions().position(property1).title("Property One"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(property1));

        LatLng property2 = new LatLng(-8.672935, 115.230927);
        mMap.addMarker(new MarkerOptions().position(property2).title("Property Two"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(property2));

        LatLng property3 = new LatLng(-8.675863, 115.213342);
        mMap.addMarker(new MarkerOptions().position(property3).title("Property Three"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(property3));

        LatLng property4 = new LatLng(-8.638708, 115.216317);
        mMap.addMarker(new MarkerOptions().position(property4).title("Property Four"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(property4));

        mMap.animateCamera(CameraUpdateFactory.newLatLngZoom(property3, 13.0f));
    }
}
