package com.example.uts;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;


public class DetailHotel extends AppCompatActivity {


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_hotel);

        getIncomingIntent();
    }

    private void getIncomingIntent() {
        if(getIntent().hasExtra("gambarHotel") && getIntent().hasExtra("namaHotel")){
            String gambarHotel = getIntent().getStringExtra("gambarHotel");
            String namaHotel = getIntent().getStringExtra("namaHotel");
            String hargaKamar = getIntent().getStringExtra("hargaKamar");
            String deskripsi = getIntent().getStringExtra("deskripsi");
            String fasilitas = getIntent().getStringExtra("fasilitas");

            setImage(gambarHotel, namaHotel, hargaKamar, deskripsi, fasilitas);
        }
    }

    private void setImage(String imageHotel, String hotel, String hargaHotel, String deks, String mfasilitas) {
        TextView name = findViewById(R.id.judul_hotel);
        name.setText(hotel);

        ImageView image = findViewById(R.id.imageDetail);
        Glide.with(this)
                .asBitmap()
                .load(imageHotel)
                .into(image);

        TextView deskripsi = findViewById(R.id.deskripsi);
        deskripsi.setText(deks);

        TextView fasilitas = findViewById(R.id.fasilitas);
        fasilitas.setText(mfasilitas);

        TextView harga = findViewById(R.id.harga);
        harga.setText(hargaHotel);
    }
}