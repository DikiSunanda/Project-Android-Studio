package com.jakgin.tokoonline;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity {

    private BottomNavigationView bottomNavigationView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initializeViews();
        setupListeners();
    }

    private void initializeViews() {
        // Inisialisasi TextView dan atur listener klik
        TextView ls1TextView = findViewById(R.id.ls1);
        ls1TextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openLihatSemuaActivity();
            }
        });

        TextView ls0TextView = findViewById(R.id.ls0);
        ls0TextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openKategoriActivity();
            }
        });

        TextView ls2TextView = findViewById(R.id.ls2);
        ls2TextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openLihatSemuaActivity();
            }
        });


        // Inisialisasi BottomNavigationView dan atur listener untuk item yang dipilih
        bottomNavigationView = findViewById(R.id.navbar_bottom);
        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                return onOptionsItemSelected(item);
            }
        });

        // Inisialisasi ImageView dan atur listener untuk membuka ProdukPakaian1Activity
        ImageView imageViewProdukMain = findViewById(R.id.imageViewProduk1);
        imageViewProdukMain.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openProdukPakaian1Activity();
            }
        });
    }

    private void setupListeners() {
        // Tambahan setupListeners untuk metode yang membutuhkan listener
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();

        // Handle item yang dipilih pada BottomNavigationView
        if (id == R.id.menu1) {
            startMainActivity();
            return true;
        } else if (id == R.id.menu4) {
            startKategoriActivity();
            return true;
        } else if (id == R.id.menu5) {
            startAboutActivity();
            return true;
        } else {
            return super.onOptionsItemSelected(item);
        }
    }
    public void openPakaianActivity(View view) {
        try {
            Intent intent = new Intent(this, PakaianActivity.class);
            startActivity(intent);
        } catch (Exception e) {
            e.printStackTrace();
            Log.e("MainActivity", "Error opening PakaianActivity: " + e.getMessage());
        }
    }

    private void startMainActivity() {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }

    private void startKategoriActivity() {
        Intent intent = new Intent(this, KategoriActivity.class);
        startActivity(intent);
    }

    private void startAboutActivity() {
        Intent intent = new Intent(this, AboutActivity.class);
        startActivity(intent);
    }


    private void openProdukPakaian1Activity() {
        try {
            Intent intent = new Intent(this, ProdukPakaian1Activity.class);
            startActivity(intent);
        } catch (Exception e) {
            e.printStackTrace();
            Log.e("MainActivity", "Error opening ProdukPakaian1Activity: " + e.getMessage());
        }
    }

    public void openElektronikActivity(View view) {
        Intent intent = new Intent(this, ElektronikActivity.class);
        startActivity(intent);
    }

    public void openMakananActivity(View view) {
        Intent intent = new Intent(this, MakananActivity.class);
        startActivity(intent);
    }

    public void openMakeupActivity(View view) {
        Intent intent = new Intent(this, MakeupActivity.class);
        startActivity(intent);
    }

    private void openLihatSemuaActivity() {
        Intent intent = new Intent(this, LihatSemuaActivity.class);
        startActivity(intent);
    }

    private void openKategoriActivity() {
        Intent intent = new Intent(this, KategoriActivity.class);
        startActivity(intent);
    }
}
