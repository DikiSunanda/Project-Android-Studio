package com.jakgin.tokoonline;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class PakaianActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pakaian);

        // Temukan ImageView di dalam layout
        ImageView imageViewProduk1 = findViewById(R.id.produkpakaian1);

        // Tambahkan OnClickListener pada ImageView
        imageViewProduk1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Implementasikan tindakan yang ingin Anda lakukan ketika gambar diklik
                // Contohnya: Buka Activity_Produk_Pakaian1
                Intent intent = new Intent(PakaianActivity.this,ProdukPakaian1Activity.class);
                startActivity(intent);
            }
        });
    }
}
