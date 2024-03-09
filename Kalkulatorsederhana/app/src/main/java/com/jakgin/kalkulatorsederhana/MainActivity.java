package com.jakgin.kalkulatorsederhana;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText A, B;
    TextView hasil;
    ImageButton tambah, kurang, kali, bagi;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        A = findViewById(R.id.BilanganA);
        B = findViewById(R.id.BilanganB);
        hasil = findViewById(R.id.hasilnilai);
        tambah = findViewById(R.id.tomboltambah);
        kurang = findViewById(R.id.tombolkurang);
        kali = findViewById(R.id.tombolkali);
        bagi = findViewById(R.id.tombolbagi);

        tambah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                hasil.setText(String.valueOf(Integer.parseInt(A.getText().toString()) + Integer.parseInt(B.getText().toString())));
            }
        });
        kurang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                hasil.setText(String.valueOf(Integer.parseInt(A.getText().toString()) - Integer.parseInt(B.getText().toString())));
            }
        });
        kali.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                hasil.setText(String.valueOf(Integer.parseInt(A.getText().toString()) * Integer.parseInt(B.getText().toString())));
            }
        });

        bagi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                hasil.setText(String.valueOf(Integer.parseInt(A.getText().toString()) / Integer.parseInt(B.getText().toString())));
            }
        });
    }
}