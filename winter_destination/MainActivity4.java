package com.example.winter_destination;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity4 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);
    }

    public void openSyrrako(View view){
        Intent intent = new Intent(this, MapsActivity.class);
        intent.putExtra("location","location1");
        startActivity(intent);
    }

    public void moni(View view){
        Intent intent = new Intent(this, MapsActivity.class);
        intent.putExtra("location","location2");
        startActivity(intent);

    }

    public void spilaio(View view){
        Intent intent = new Intent(this, MapsActivity.class);
        intent.putExtra("location","location3");
        startActivity(intent);
    }
}