package com.example.winter_destination;

import androidx.fragment.app.FragmentActivity;

import android.os.Bundle;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;
import com.example.winter_destination.databinding.ActivityMapsBinding;

public class MapsActivity extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;
    private ActivityMapsBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityMapsBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

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
        String location = getIntent().getStringExtra("location");
        // Add a marker in Sydney and move the camera
        if (location.equals("location1")) {
            LatLng syrrako = new LatLng(39.5947268,21.1053612);
            mMap.addMarker(new MarkerOptions().position(syrrako).title("Marker in Sydney"));
            mMap.animateCamera(CameraUpdateFactory.newLatLngZoom(syrrako, 18f));
    }
        else if (location.equals("location2")){
            LatLng moni = new LatLng(39.5675375, 21.128005);
            mMap.addMarker(new MarkerOptions().position(moni).title("Marker in Sydney"));
            mMap.animateCamera(CameraUpdateFactory.newLatLngZoom(moni, 18f));
        }
        else if (location.equals("location3")){
            LatLng spilaio = new LatLng(39.5132281, 21.084803);
            mMap.addMarker(new MarkerOptions().position(spilaio).title("Marker in Sydney"));
            mMap.animateCamera(CameraUpdateFactory.newLatLngZoom(spilaio, 18f));
        }
        else if (location.equals("location4")){
            LatLng res1 = new LatLng(39.5838358, 21.1206157);
            mMap.addMarker(new MarkerOptions().position(res1).title("Marker in Sydney"));
            mMap.animateCamera(CameraUpdateFactory.newLatLngZoom(res1, 18f));
        }
        else if (location.equals("location5")){
            LatLng res2 = new LatLng(39.582929, 21.1226723);
            mMap.addMarker(new MarkerOptions().position(res2).title("Marker in Sydney"));
            mMap.animateCamera(CameraUpdateFactory.newLatLngZoom(res2, 18f));
        }
        else if (location.equals("location6")){
            LatLng res3 = new LatLng(39.594283, 21.1072236);
            mMap.addMarker(new MarkerOptions().position(res3).title("Marker in Sydney"));
            mMap.animateCamera(CameraUpdateFactory.newLatLngZoom(res3, 18f));
        }


}}