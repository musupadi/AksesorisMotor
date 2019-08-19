package com.destiny.motoraksesoris.Activity;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.graphics.Color;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.destiny.motoraksesoris.Adapter.BarangAdapter;
import com.destiny.motoraksesoris.Adapter.TokoAdapter;
import com.destiny.motoraksesoris.Model.Model;
import com.destiny.motoraksesoris.Model.MrClassicModel;
import com.destiny.motoraksesoris.Model.TokoModel;
import com.destiny.motoraksesoris.R;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.appbar.CollapsingToolbarLayout;

import java.util.ArrayList;

public class BarangActivity extends AppCompatActivity {
    ImageView gambar;
    TextView nama,telepon;
    private ArrayList<Model> pList = new ArrayList<>();
    RecyclerView rvCategory;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_barang);
        Toolbar toolbar = (Toolbar)findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        if(getSupportActionBar() != null)
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        Intent data = getIntent();
        //Constant
        rvCategory = (RecyclerView)findViewById(R.id.recycler);
        gambar = (ImageView)findViewById(R.id.ivGambar);
        nama = (TextView)findViewById(R.id.tvNama);
        telepon = (TextView)findViewById(R.id.tvTelepon);
        final String Gambar = data.getStringExtra("GAMBAR");
        final String Nama = data.getStringExtra("NAMA");
        final String Telepon = data.getStringExtra("TELEPON");
        final String Suara = data.getStringExtra("SUARA");
        gambar.setImageResource(Integer.parseInt(Gambar));
        nama.setText(Nama);
        telepon.setText(Telepon);
        final MediaPlayer Suaras = MediaPlayer.create(BarangActivity.this,Integer.parseInt(Suara));
        Suaras.start();
        rvCategory.setLayoutManager(new GridLayoutManager(this, 2));
        pList.addAll(MrClassicModel.getListData());
        BarangAdapter cardViewAdapter = new BarangAdapter(this);
        cardViewAdapter.setList(pList);
        rvCategory.setAdapter(cardViewAdapter);
    }
}
