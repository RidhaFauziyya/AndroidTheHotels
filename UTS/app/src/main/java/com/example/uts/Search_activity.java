package com.example.uts;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.DialogFragment;

import android.app.DatePickerDialog;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class Search_activity extends AppCompatActivity implements
        AdapterView.OnItemSelectedListener {

    private  static final String TAG = Search_activity.class.getSimpleName();
    private String spinnerLabel = "";
    String key1 = "check-in";
    String key2 = "check-out";
    String key3 = "spinner";
    String checkIn ;
    String checkOut;
    String showString;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search);

        Intent intent = getIntent();
        String pesan = intent.getStringExtra("pesan");
        Toast.makeText(Search_activity.this, pesan,
                Toast.LENGTH_SHORT).show();

        Spinner spinner = (Spinner) findViewById(R.id.spinner);
        if (spinner != null) {
            spinner.setOnItemSelectedListener(this);
        }
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,
                R.array.labels_array, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        if (spinner != null) {
            spinner.setAdapter(adapter);
        }
    }

    public void dateCheckIn(View view) {
        DialogFragment newFragment = new DateCheckIn();
        newFragment.show(getSupportFragmentManager(),
                getString(R.string.date_picker1));
    }
    public void processCheckIn(int year, int month, int day) {
        String month_string = Integer.toString(month + 1);
        String day_string = Integer.toString(day);
        String year_string = Integer.toString(year);
        checkIn = (month_string + "/" +
                day_string + "/" + year_string);
        TextView masuk = (TextView) findViewById(R.id.tgl_masuk);
        masuk.setText(checkIn);
    }


    public void dateCheckOut(View view) {
        DialogFragment newFragment = new DateCheckOut();
        newFragment.show(getSupportFragmentManager(),
                getString(R.string.date_picker2));
    }

    public void processCheckOut(int year, int month, int day) {
        String month_string = Integer.toString(month + 1);
        String day_string = Integer.toString(day);
        String year_string = Integer.toString(year);
        checkOut = (month_string + "/" +
                day_string + "/" + year_string);
        TextView keluar = (TextView) findViewById(R.id.tgl_keluar);
        keluar.setText(checkOut);
    }


    @Override
    public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
        spinnerLabel = adapterView.getItemAtPosition(i).toString();
        showText();
    }

    private void showText() {
        showString = spinnerLabel;
    }


    @Override
    public void onNothingSelected(AdapterView<?> adapterView) {
        Log.d(TAG, "onNothingSelected: ");
    }


    public void clickSearch(View view) {
        Intent intent = new Intent(Search_activity.this, ListHotel.class);
        intent.putExtra(key1, checkIn);
        intent.putExtra(key2, checkOut);
        intent.putExtra(key3, showString);
        startActivity(intent);
    }
}