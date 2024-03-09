package com.jakgin.tokoonline; // Add this package statement at the beginning

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class ProdukPakaian1Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_produk_pakaian1);

        // Temukan Button "Tambah ke Keranjang"
        Button btnTambahKeranjang = findViewById(R.id.buttonTambahKeranjang);

        // Set OnClickListener pada tombol "Tambah ke Keranjang"
        btnTambahKeranjang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tambahProdukKeKeranjang();
            }
        });
    }

    // Metode untuk menambahkan produk ke dalam keranjang
    private void tambahProdukKeKeranjang() {
        // Implementasikan logika pemesanan di sini
        // Misalnya, Anda dapat menggunakan shared preferences, database lokal, atau metode lainnya.

        // Contoh: Menampilkan pesan Toast sebagai indikasi bahwa produk telah ditambahkan
        Toast.makeText(this, "Produk telah ditambahkan ke keranjang!", Toast.LENGTH_SHORT).show();

        // Pindah ke activity CartActivity setelah menambahkan ke keranjang
        Intent intent = new Intent(this, CartActivity.class);
        startActivity(intent);
    }
}
