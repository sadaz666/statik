package com.example.demov2.screens;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.demov2.R;

public class AddRoomActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_room);
    }

    public void goMenu(View view) {
        Intent intent = new Intent(AddRoomActivity.this, MainActivity.class);
        startActivity(intent);
    }
}