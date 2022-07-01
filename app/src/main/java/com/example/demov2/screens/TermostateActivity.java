package com.example.demov2.screens;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.demov2.R;

public class TermostateActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_termostate);
    }

    public void goToMainScreen(View view) {
        Intent intent = new Intent(TermostateActivity.this, MainActivity.class);
        startActivity(intent);
    }

    public void addRoom(View view) {
    }

    public void goLightGo(View view) {
        Intent intent = new Intent(TermostateActivity.this, LightActivity.class);
        startActivity(intent);
    }
}