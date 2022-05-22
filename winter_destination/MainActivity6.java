package com.example.winter_destination;

import androidx.appcompat.app.AppCompatActivity;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;

public class MainActivity6 extends AppCompatActivity {
    MediaPlayer player;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main6);
        player = MediaPlayer.create(this, R.raw.song);
    }

    public void start(View view){
        player.start();

    }

    public void stop(View view){
        player.stop();
}}