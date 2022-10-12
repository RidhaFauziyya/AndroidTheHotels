package com.example.uts;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;

import java.util.ArrayList;

public class HotelAdapter extends
        RecyclerView.Adapter<HotelAdapter.ViewHolder> {

    private ArrayList<String> namaHotel = new ArrayList<>();
    private ArrayList<String> gambarHotel = new ArrayList<>();
    private ArrayList<String> hargaHotel = new ArrayList<>();
    private ArrayList<String> deskripsi = new ArrayList<>();
    private ArrayList<String> fasilitas = new ArrayList<>();
    private final Context mContext;

    public HotelAdapter(Context context, ArrayList<String> name, ArrayList<String> gambar,
                        ArrayList<String> harga, ArrayList<String> desk, ArrayList<String> mfasilitas ){
        namaHotel = name;
        gambarHotel = gambar;
        hargaHotel = harga;
        deskripsi = desk;
        fasilitas = mfasilitas;
        mContext = context;
    }

    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_hotel, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, @SuppressLint("RecyclerView") final int position) {
        Glide.with(mContext)
                .asBitmap()
                .load(gambarHotel.get(position))
                .into(holder.gambar);

        holder.name.setText(namaHotel.get(position));
        holder.harga.setText(hargaHotel.get(position));

        holder.parentLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(mContext, namaHotel.get(position), Toast.LENGTH_SHORT).show();

                Intent intent = new Intent(mContext, DetailHotel.class);
                intent.putExtra("gambarHotel", gambarHotel.get(position));
                intent.putExtra("namaHotel", namaHotel.get(position));
                intent.putExtra("hargaKamar", hargaHotel.get(position));
                intent.putExtra("deskripsi", deskripsi.get(position));
                intent.putExtra("fasilitas", fasilitas.get(position));
                mContext.startActivity(intent);
            }
        });
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        public TextView name;
        public TextView harga;
        public ImageView gambar;
        LinearLayout parentLayout;

        public ViewHolder(View itemView) {
            super(itemView);

            name = itemView.findViewById(R.id.text_headline);
            harga =itemView.findViewById(R.id.text_subhead);
            gambar =  itemView.findViewById(R.id.imageList);
            parentLayout = itemView.findViewById(R.id.parent_layout);
        }
    }

    @Override
    public int getItemCount() {
        return namaHotel.size();
    }


}
