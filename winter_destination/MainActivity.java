package com.example.winter_destination;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView textView1;
    Button button11;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView1 = findViewById(R.id.textView);
        button11 = findViewById(R.id.button11);
        Intent intent2 = getIntent();
        String text = intent2.getStringExtra("text");
        textView1.setText(text);
    }

    public void signIn(View view){
        Intent intent = new Intent(this, MainActivity2.class);
        startActivity(intent);
    }

    public void information(View view){
        Intent intent = new Intent(this, MainActivity3.class);
        startActivity(intent);

    }

    public void sightseeing(View view){
        Intent intent = new Intent(this, MainActivity4.class);
        startActivity(intent);
    }

    public void whereToEat(View view){
        Intent intent = new Intent(this, MainActivity5.class);
        startActivity(intent);
    }

    public void activities(View view){
        Intent intent = new Intent(this, MainActivity6.class);
        startActivity(intent);
    }
}