package com.destiny.motoraksesoris.Activity;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.LinearLayout;

import com.destiny.motoraksesoris.R;

public class HomeActivity extends AppCompatActivity {
    LinearLayout Toko,Profile,Tentang;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        Toko=(LinearLayout)findViewById(R.id.linearToko);
        Profile=(LinearLayout)findViewById(R.id.linearProfile);
        Tentang=(LinearLayout)findViewById(R.id.linearTentang);
        final MediaPlayer Suaras = MediaPlayer.create(HomeActivity.this,R.raw.selamatdatang);
        Suaras.start();
        Toko.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Suaras.stop();
                Intent intent = new Intent(HomeActivity.this,TokoActivity.class);
                startActivity(intent);
            }
        });
        Profile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Suaras.stop();
                Intent intent = new Intent(HomeActivity.this,AkunActivity.class);
                startActivity(intent);
            }
        });
        Tentang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Suaras.stop();
                Intent intent = new Intent(HomeActivity.this,TentangActivity.class);
                startActivity(intent);
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()){
            case R.id.Logout:
                Intent intent = new Intent(HomeActivity.this,LoginActivity.class);
                startActivity(intent);
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }

    @Override
    public void onBackPressed() {

    }
}
