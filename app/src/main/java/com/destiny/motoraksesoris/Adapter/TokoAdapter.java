package com.destiny.motoraksesoris.Adapter;

import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.destiny.motoraksesoris.Activity.BarangActivity;
import com.destiny.motoraksesoris.Activity.LoginActivity;
import com.destiny.motoraksesoris.Activity.RegisterActivity;
import com.destiny.motoraksesoris.Model.Model;
import com.destiny.motoraksesoris.R;
import com.destiny.motoraksesoris.SharedPreferance.DB_Helper;

import java.util.ArrayList;

public class TokoAdapter extends RecyclerView.Adapter<TokoAdapter.CardViewViewHolder>{
    private Context context;
    private ArrayList<Model> list;


    private ArrayList<Model> getListLaguWajib() {
        return list;
    }
    public void setList(ArrayList<Model> list) {
        this.list= list;
    }
    public TokoAdapter(Context context) {
        this.context = context;
    }

    @NonNull
    @Override
    public CardViewViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.list_toko, viewGroup, false);
        return new CardViewViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull final CardViewViewHolder cardViewViewHolder, int i) {
        final Model p = getListLaguWajib().get(i);
        cardViewViewHolder.nama.setText(p.getNama());
        cardViewViewHolder.telpon.setText(p.getTelpon());
        cardViewViewHolder.alamat.setText(p.getAlamat());
        cardViewViewHolder.gambar.setImageResource(Integer.parseInt(p.getGambar()));
        cardViewViewHolder.list.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent goInput = new Intent(context, BarangActivity.class);
                goInput.putExtra("GAMBAR",p.getGambar());
                goInput.putExtra("NAMA",p.getNama());
                goInput.putExtra( "TELEPON",p.getTelpon());
                goInput.putExtra("SUARA",p.getSuaraToko());
                context.startActivities(new Intent[]{goInput});
            }
        });
    }

    @Override
    public int getItemCount() {
        return getListLaguWajib().size();
    }

    class CardViewViewHolder extends RecyclerView.ViewHolder{
        TextView nama, telpon,alamat;
        LinearLayout list;
        ImageView gambar;
        CardViewViewHolder(View itemView) {
            super(itemView);
            nama = itemView.findViewById(R.id.tvNama);
            telpon= itemView.findViewById(R.id.tvNomor);
            list = itemView.findViewById(R.id.List);
            alamat = itemView.findViewById(R.id.tvAlamat);
            gambar = itemView.findViewById(R.id.ivGambar);
        }
    }
}
