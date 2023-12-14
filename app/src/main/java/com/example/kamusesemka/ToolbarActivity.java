package com.example.kamusesemka;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class ToolbarActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_toolbar);
    }

    public void Like(View view) {
    }

    public void Profile(View view) {
        Intent intent = new Intent(ToolbarActivity.this, ProfileActivity.class);
        startActivity(intent);
    }

    public void Info(View view) {
        Intent intent = new Intent(ToolbarActivity.this, InfoActivity.class);
        startActivity(intent);
    }

    public void Next(View view) {
        Intent intent = new Intent(ToolbarActivity.this, MainActivity.class);
        startActivity(intent);
    }
}