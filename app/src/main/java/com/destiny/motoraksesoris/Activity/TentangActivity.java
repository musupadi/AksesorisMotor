package com.destiny.motoraksesoris.Activity;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;

import com.destiny.motoraksesoris.R;

public class TentangActivity extends AppCompatActivity {
    MediaPlayer Suaras;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tentang);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        Suaras = MediaPlayer.create(TentangActivity.this,R.raw.selamatdatang);
        Suaras.start();
    }
    @Override
    public void onBackPressed() {
        Suaras.stop();
        super.onBackPressed();
    }
}
