package com.example.megawe;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class ProfilActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profil);

        getSupportActionBar().setTitle("Biodata");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }
}
