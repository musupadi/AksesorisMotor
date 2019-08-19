package com.destiny.motoraksesoris.Activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.destiny.motoraksesoris.Adapter.TokoAdapter;
import com.destiny.motoraksesoris.Model.Model;
import com.destiny.motoraksesoris.Model.TokoModel;
import com.destiny.motoraksesoris.R;

import java.util.ArrayList;

public class TokoActivity extends AppCompatActivity {
    private ArrayList<Model> pList = new ArrayList<>();
    RecyclerView rvCategory;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_toko);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        rvCategory = (RecyclerView)findViewById(R.id.recycler);
        rvCategory.setLayoutManager(new LinearLayoutManager(this));
        pList.addAll(TokoModel.getListData());
        TokoAdapter cardViewAdapter = new TokoAdapter(this);
        cardViewAdapter.setList(pList);
        rvCategory.setAdapter(cardViewAdapter);
    }
}
