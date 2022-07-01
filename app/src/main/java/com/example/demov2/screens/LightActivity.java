package com.example.demov2.screens;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.demov2.R;

public class LightActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_light);
    }

    public void goToMainScreen(View view) {
        Intent intent = new Intent(LightActivity.this, MainActivity.class);
        startActivity(intent);
    }

    public void goTerm(View view) {
        Intent intent = new Intent(LightActivity.this, TermostateActivity.class);
        startActivity(intent);
    }
}