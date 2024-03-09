package com.jakgin.tokoonline;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class AboutActivity extends AppCompatActivity {

    private BottomNavigationView bottomNavigationView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);

        bottomNavigationView = findViewById(R.id.navbar_bottom);
        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                return onOptionsItemSelected(item);
            }
        });
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();

        if (id == R.id.menu1) {
            startMainActivity();
            return true;
        } else if (id == R.id.menu4) {
            startKategoriActivity();
            return true;
        } else if (id == R.id.menu5) {
            // Aksi untuk item-menu 5 pada BottomNavigationView (sesuaikan dengan kebutuhan)
            return true;
        } else {
            return super.onOptionsItemSelected(item);
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
}
