package com.example.kamusesemka;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class backgroundActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_background);
    }

    public void Next(View view) {
        Intent intent = new Intent(backgroundActivity.this, ToolbarActivity.class);
        startActivity(intent);
    }
}