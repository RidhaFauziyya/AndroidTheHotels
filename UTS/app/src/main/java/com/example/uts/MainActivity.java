package com.example.uts;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText username = (EditText) findViewById(R.id.username);
        EditText password = (EditText) findViewById(R.id.password);
        Button login = (Button) findViewById(R.id.button);
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String user = username.getText().toString();
                String pass = password.getText().toString();
                if (user.equals("mike@email.com") && pass.equals("abc123")){
                    Intent intent = new Intent(MainActivity.this, Search_activity.class);
                    intent.putExtra("pesan", "Login Berhasil");
                    startActivity(intent);
                }
                else{
                    AlertDialog.Builder pesan_gagal = new
                            AlertDialog.Builder(MainActivity.this);
                    pesan_gagal.setTitle(R.string.judulDialog);
                    pesan_gagal.setMessage(R.string.pesanDialog).setNegativeButton(R.string.cancel, null).create().show();
                }
            }
        });
    }

}