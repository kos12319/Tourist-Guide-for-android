package com.example.winter_destination;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;


public class MainActivity3 extends AppCompatActivity {
    TextView textView;
    MyTTS myTTS;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        textView = findViewById(R.id.textView6);
        myTTS = new MyTTS(getApplicationContext());

    }

    public void speak(View view){
        myTTS.speak(textView.getText().toString());

    }


}