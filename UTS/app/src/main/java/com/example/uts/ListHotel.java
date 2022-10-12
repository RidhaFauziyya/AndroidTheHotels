package com.example.uts;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.TextView;

import java.util.ArrayList;

public class ListHotel extends AppCompatActivity {

    private ArrayList<String> namaHotel = new ArrayList<>();
    private ArrayList<String> gambarHotel = new ArrayList<>();
    private ArrayList<String> hargaHotel = new ArrayList<>();
    private ArrayList<String> deskripsi = new ArrayList<>();
    private ArrayList<String> fasilitas = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_hotel);

        String key1 = "check-in";
        String key2 = "check-out";
        String key3 = "spinner";
        String dateMesssage1;
        String dateMesssage2;
        String showString;

        TextView date1 = (TextView) findViewById(R.id.text_checkin);
        TextView date2 = (TextView) findViewById(R.id.text_checkout);
        TextView spinner = (TextView) findViewById(R.id.text_kamar);
        Bundle intent = getIntent().getExtras();
        dateMesssage1 = intent.getString(key1);
        dateMesssage2 = intent.getString(key2);
        showString = intent.getString(key3);
        date1.setText(dateMesssage1);
        date2.setText(dateMesssage2);
        spinner.setText(showString);
        
        initImageBitmaps();
    }

    private void initImageBitmaps() {
        namaHotel.add("Arosa Hotel");
        hargaHotel.add("Rp 900.000 /kamar /malam");
        deskripsi.add("Arosa Hotel merupakan hotel bintang 4 yang berlokasi di tengah kota Yogyakarta. " +
                "Tepatnya berada di Jl.Magelang Km 2 No.84, kecamatan Tegalrejo");
        fasilitas.add("1. Kasur Queen Size" + "\n" +
                "2. Inlude Sarapan Pagi" + "\n" +
                "3. Water Heater" + "\n" +
                "4. AC" + "\n" +
                "5. Kolam Renang Outdoor");
        gambarHotel.add("https://s-light.tiket.photos/t/01E25EBZS3W0FY9GTG6C42E1SE/t_htl-dskt/tix-hotel/images-web/2020/10/31/ebeb8c01-d1bd-478c-b90e-4f37c5ce99f1-1604119931004-24a85db52ff880f3aac69ed45c55bc49.jpg");

        namaHotel.add("L Hotel");
        hargaHotel.add("Rp 1.200.000 /kamar /malam");
        deskripsi.add("L Hotel merupakan hotel bintang 5 yang berlokasi di dekat jalan Malioboro. " +
                "Tepatnya berada di Jl.Pasar Kembang No.10, Daerah Istimewa Yoogyakarta." +
                "Dekat dengan berbagai tempat wisata di Kota Yogyakarata, sehingga memudahkan Anda untuk berwisata" +
                "di dekat hotel.");
        fasilitas.add("1. Queen Size or Twin Bed" + "\n" +
                "2. Inlude Sarapan Pagi" + "\n" +
                "3. Water Heater" + "\n" +
                "4. AC" + "\n" +
                "5. Kolam Renang Indoor");
        gambarHotel.add("https://pix10.agoda.net/hotelImages/124/1246280/1246280_16061017110043391702.jpg?ca=6&ce=1&s=1024x768");

        namaHotel.add("Hotel Edison");
        hargaHotel.add("Rp 600.000 /kamar /malam");
        deskripsi.add("Hotel Edison hotel bintang 3 yang menyediakan kamar-kamar eksklusif dengan fasilitas yang memadai" +
                "dan harga yang cukup terjangkau. Hotel Edison terletak di Jl.Godean Km 6 No 82, Godean, Yogyakarta.");
        fasilitas.add("1. Twin Bed" + "\n" +
                "2. AC" + "\n" +
                "3. Restoran" + "\n" );
        gambarHotel.add("https://www.edisonhotelnyc.com/resourcefiles/homeimages/edison-hero-image-facade.jpg?version=9142022133607");

        namaHotel.add("Hotel Tentrem");
        hargaHotel.add("Rp 1000.000 /kamar /malam");
        deskripsi.add("Hotel Tentrem Yogyakarta merupakan satu dari sekian banyak hotel bintang 5 yang sering menjadi " +
                "andalan wisatawan yang berlibur di Kota Jogja. Terletak di Jalan AM Sangaji No. 72 A, Yogyakarta," +
                " hotel yang didesain dengan nuansa Jawa modern ini siap memanjakan tamu dengan fasilitas kelas satu.");
        fasilitas.add("1. Queen Size or Twin Bed" + "\n" +
                "2. AC" + "\n" +
                "3. Restoran" + "\n" +
                "4. Lift" + "\n" +
                "5. Kolam Renang");
        gambarHotel.add("https://ik.imagekit.io/tvlk/apr-asset/dgXfoyh24ryQLRcGq00cIdKHRmotrWLNlvG-TxlcLxGkiDwaUSggleJNPRgIHCX6/hotel/asset/10002860-1674x1024-FIT_AND_TRIM-522c3d9c57f155d65e1d789869352bc2.jpeg?_src=imagekit&tr=dpr-2,c-at_max,h-488,q-40,w-768");

        namaHotel.add("The Alana Yogyakarta Hotel & Convention Center");
        hargaHotel.add("Rp 700.000 /kamar /malam");
        deskripsi.add("The Alana Yogyakarta Hotel & Convention Center adalah hotel di lokasi yang baik, tepatnya berada di Ngaglik.\n" +
                "\n" +
                "Dari Stasiun Maguwo , hotel ini hanya berjarak sekitar 8,27 km.\n" +
                "\n" +
                "Selain letaknya yang strategis, The Alana Yogyakarta Hotel & Convention Center juga merupakan hotel dekat Pandawa Water World berjarak sekitar 49,37 km dan Toko Emas Barokah Salam berjarak sekitar 48,6 km.");
        fasilitas.add("1. Queen Size or Twin Bed" + "\n" +
                "2. AC" + "\n" +
                "3. Restoran" + "\n" +
                "4. Lift" + "\n" +
                "5. Resepsionis 24 Jam");
        gambarHotel.add("https://ik.imagekit.io/tvlk/apr-asset/dgXfoyh24ryQLRcGq00cIdKHRmotrWLNlvG-TxlcLxGkiDwaUSggleJNPRgIHCX6/hotel/asset/10007104-800x533-FIT_AND_TRIM-d9e8a0e4127df818538b83ad9622957b.jpeg?_src=imagekit&tr=dpr-2,c-at_max,h-360,q-40,w-640");

        namaHotel.add("Yellow Star Gejayan Hotel");
        hargaHotel.add("Rp 338.000 /kamar /malam");
        deskripsi.add("Bagi Anda yang menginginkan kualitas pelayanan oke dengan harga yang ramah di kantong, Yellow Star Gejayan Hotel adalah pilihan yang tepat. Karena meski murah, akomodasi ini menyediakan fasilitas memadai dan pelayanan yang tetap terjaga mutunya.\n" +
                "\n" +
                "Jika Anda berniat menginap dalam jangka waktu yang lama, Yellow Star Gejayan Hotel adalah pilihan tepat. Berbagai fasilitas yang tersedia dan kualitas pelayanan yang baik akan membuat Anda merasa sedang berada di rumah sendiri.");
        fasilitas.add("1. Twin Bed" + "\n" +
                "2. AC" + "\n" +
                "3. Restoran" + "\n" +
                "4. Resepsionis 24 Jam");
        gambarHotel.add("https://ik.imagekit.io/tvlk/apr-asset/dgXfoyh24ryQLRcGq00cIdKHRmotrWLNlvG-TxlcLxGkiDwaUSggleJNPRgIHCX6/hotel/asset/10008560-3582x3817-FIT_AND_TRIM-5d46218d78ab8ddfa18a31e626006954.jpeg?_src=imagekit&tr=dpr-2,c-at_max,h-360,q-40,w-640");

        namaHotel.add("Hotel Neo Malioboro by ASTON");
        hargaHotel.add("Rp 1.064.000 /kamar /malam");
        deskripsi.add("Hotel bintang 3 yang didukung prasarana komplet ini bertempat di Pasar Kembang No. 21 dan berdekatan dengan pusat perbelanjaan Malioboro. " +
                "Penginapan ini terdiri dari delapan lantai dan 155 kamar bergaya kontemporer yang dikombinasikan dengan sentuhan tradisional Jawa.");
        fasilitas.add("1. Queen Size or Twin Bed" + "\n" +
                "2. AC" + "\n" +
                "3. Restoran" + "\n" +
                "4. Lift" + "\n" +
                "5. Resepsionis 24 Jam"+ "\n" +
                "6. Kolam Renang"+ "\n" +
                "7. Parkir or Basement");
        gambarHotel.add("https://ik.imagekit.io/tvlk/apr-asset/dgXfoyh24ryQLRcGq00cIdKHRmotrWLNlvG-TxlcLxGkiDwaUSggleJNPRgIHCX6/hotel/asset/10007119-014228d72e280d49d13431d39835ad68.jpeg?_src=imagekit&tr=dpr-2,c-at_max,h-360,q-40,w-640");

        namaHotel.add("Maranatha Grand Hotel Yogyakarta");
        hargaHotel.add("Rp 350.000 /kamar /malam");
        deskripsi.add("Maranatha Grand Hotel Yogyakarta adalah hotel di lokasi yang baik, tepatnya berada di Jalan Malioboro.\n" +
                "\n" +
                "Selain letaknya yang strategis, Maranatha Grand Hotel Yogyakarta juga merupakan hotel dekat Sub Terminal Penggung berjarak sekitar 36,51 km dan Tugu Kartasura berjarak sekitar 49,37 km.");
        fasilitas.add("1. Twin Bed" + "\n" +
                "2. AC" + "\n" +
                "3. Restoran" + "\n" +
                "4. Resepsionis 24 Jam");
        gambarHotel.add("https://ik.imagekit.io/tvlk/apr-asset/dgXfoyh24ryQLRcGq00cIdKHRmotrWLNlvG-TxlcLxGkiDwaUSggleJNPRgIHCX6/hotel/asset/67711079-1100x825-FIT_AND_TRIM-06d581423113bb90a0bba5501552e333.jpeg?_src=imagekit&tr=dpr-2,c-at_max,h-488,q-40,w-768");

        namaHotel.add("GAIA Cosmo Hotel");
        hargaHotel.add("Rp 820.000 /kamar /malam");
        deskripsi.add("Gaia Cosmo Hotel hadir sebagai akomodasi bisnis modern yang terletak di Kota Yogyakarta. Tepatnya berada di Jalan Ipda Tut Harsono No 16, Muja Muju, Umbulharjo. Lokasinya cukup strategis, yakni dekat dengan pusat perkantoran dan " +
                "aneka kuliner, bahkan hanya berjarak sekitar 5 km dari Bandara Adi Sucipto.");
        fasilitas.add("1. Queen Size or Twin Bed" + "\n" +
                "2. AC" + "\n" +
                "3. Restoran" + "\n" +
                "4. Lift" + "\n" +
                "5. Resepsionis 24 Jam"+ "\n" +
                "6. Kolam Renang");
        gambarHotel.add("https://ik.imagekit.io/tvlk/apr-asset/dgXfoyh24ryQLRcGq00cIdKHRmotrWLNlvG-TxlcLxGkiDwaUSggleJNPRgIHCX6/hotel/asset/10014944-2048x1154-FIT_AND_TRIM-22af7e25f66dbfc51d578060561741d6.jpeg?_src=imagekit&tr=dpr-2,c-at_max,h-488,q-40,w-768");

        namaHotel.add("Aveta Hotel Malioboro");
        hargaHotel.add("Rp 1.048.000 /kamar /malam");
        deskripsi.add("Menginap di Aveta Hotel Malioboro saat anda sedang berada di Jalan Malioboro adalah sebuah pilihan cerdas.\n" +
                "\n" +
                "Dari Stasiun Maguwo , hotel ini hanya berjarak sekitar 7,88 km.\n" +
                "\n" +
                "hotel ini cukup mudah dijangkau karena berdekatan dengan fasilitas publik.");
        fasilitas.add("1. Queen Size or Twin Bed" + "\n" +
                "2. AC" + "\n" +
                "3. Restoran" + "\n" +
                "4. Lift" + "\n" +
                "5. Resepsionis 24 Jam"+ "\n" +
                "6. Kolam Renang"+ "\n" +
                "7. Parkir or Basement");
        gambarHotel.add("https://ik.imagekit.io/tvlk/apr-asset/dgXfoyh24ryQLRcGq00cIdKHRmotrWLNlvG-TxlcLxGkiDwaUSggleJNPRgIHCX6/hotel/asset/20018167-8a5ad8c2be7c9293dd66f929fc4ef49d.jpeg?_src=imagekit&tr=dpr-2,c-at_max,h-488,q-40,w-768");
        
        initRecycleView();
    }

    private void initRecycleView() {
        RecyclerView recyclerView = findViewById(R.id.recyclerView);
        HotelAdapter adapter = new HotelAdapter(this, namaHotel, gambarHotel, hargaHotel, deskripsi, fasilitas);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }

}