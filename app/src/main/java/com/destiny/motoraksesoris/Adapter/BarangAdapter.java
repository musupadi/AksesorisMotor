package com.destiny.motoraksesoris.Adapter;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.destiny.motoraksesoris.Activity.BarangActivity;
import com.destiny.motoraksesoris.Model.Model;
import com.destiny.motoraksesoris.R;

import java.util.ArrayList;

public class BarangAdapter extends RecyclerView.Adapter<BarangAdapter.CardViewViewHolder>{
    private Context context;
    private ArrayList<Model> list;


    private ArrayList<Model> getListLaguWajib() {
        return list;
    }
    public void setList(ArrayList<Model> list) {
        this.list= list;
    }
    public BarangAdapter(Context context) {
        this.context = context;
    }

    @NonNull
    @Override
    public CardViewViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.list_barang, viewGroup, false);
        return new CardViewViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull final CardViewViewHolder cardViewViewHolder, int i) {
        final Model p = getListLaguWajib().get(i);
        cardViewViewHolder.nama.setText(p.getNama());
        cardViewViewHolder.gambar.setImageResource(Integer.parseInt(p.getGambar()));
        cardViewViewHolder.harga.setText(p.getHarga());
    }

    @Override
    public int getItemCount() {
        return getListLaguWajib().size();
    }

    class CardViewViewHolder extends RecyclerView.ViewHolder{
        TextView nama,harga;
        LinearLayout list;
        ImageView gambar;
        CardViewViewHolder(View itemView) {
            super(itemView);
            nama = itemView.findViewById(R.id.tvNama);
            harga= itemView.findViewById(R.id.tvHarga);
            list = itemView.findViewById(R.id.List);
            gambar = itemView.findViewById(R.id.ivGambar);
        }
    }
}
