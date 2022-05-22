package com.example.winter_destination;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;


public class MainActivity2 extends AppCompatActivity {
    EditText editText1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        editText1 = findViewById(R.id.editTextTextPersonName);
    }

    public void accept(View view) {
        Intent intent2 = new Intent(this, MainActivity.class);
        Toast.makeText(this, "Hello " + editText1.getText().toString(), Toast.LENGTH_LONG).show();
        intent2.putExtra("text", editText1.getText().toString());
        startActivity(intent2);
    }

    public void cancel(View view) {
        Intent intent2 = new Intent(this, MainActivity.class);
        startActivity(intent2);
    }
}