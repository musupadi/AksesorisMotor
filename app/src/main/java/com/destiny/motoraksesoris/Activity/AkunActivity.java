package com.destiny.motoraksesoris.Activity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.destiny.motoraksesoris.R;

public class AkunActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_akun);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }
}
