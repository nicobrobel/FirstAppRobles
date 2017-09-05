package com.nico.robles.firstapp;

import android.content.Intent;
import android.view.View;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class ActivityOne extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_one);
    }

    public void nextActivity(View view){
        Intent intent = new Intent(this, ActivityTwo.class);
        startActivity(intent);

    }
}
