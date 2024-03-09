package com.jakgin.tokoonline;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class LoginActivity extends AppCompatActivity {

    private EditText usernameEditText;
    private EditText passwordEditText;
    private TextView lupaKataSandiTextView;
    private Button loginButton;
    private TextView belumpunyaakunTextView;
    private TextView registerTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        // Mendapatkan referensi ke elemen UI
        usernameEditText = findViewById(R.id.edt_username_login);
        passwordEditText = findViewById(R.id.edt_pass_login);
        lupaKataSandiTextView = findViewById(R.id.text_lupakatasandi);
        loginButton = findViewById(R.id.btn_login1);
        belumpunyaakunTextView = findViewById(R.id.text_belumpunyaakun);
        registerTextView = findViewById(R.id.text_register);

        // Menambahkan OnClickListener untuk button login
        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Memeriksa apakah username dan password sudah diisi
                if (isInputValid()) {
                    // Jika valid, intent untuk memulai MainActivity
                    Intent intent = new Intent(LoginActivity.this, MainActivity.class);
                    startActivity(intent);
                    finish(); // Menutup LoginActivity agar tidak dapat dikembalikan dengan tombol back
                } else {
                    // Jika tidak valid, menampilkan pesan kesalahan menggunakan Toast
                    showErrorMessage("Harap isi username dan password");
                }
            }
        });

        // Menambahkan OnClickListener untuk teks lupa kata sandi
        lupaKataSandiTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Tambahkan logika untuk menghandle lupa kata sandi di sini
            }
        });

        // Menambahkan OnClickListener untuk teks pendaftaran
        registerTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Intent untuk memulai RegisterActivity
                Intent intent = new Intent(LoginActivity.this, RegisterActivity.class);
                startActivity(intent);
            }
        });
    }

    // Fungsi untuk memeriksa apakah input username dan password sudah diisi
    private boolean isInputValid() {
        String username = usernameEditText.getText().toString().trim();
        String password = passwordEditText.getText().toString().trim();

        // Memeriksa apakah input kosong
        return !TextUtils.isEmpty(username) && !TextUtils.isEmpty(password);
    }

    // Fungsi untuk menampilkan pesan kesalahan menggunakan Toast
    private void showErrorMessage(String message) {
        Toast.makeText(LoginActivity.this, message, Toast.LENGTH_SHORT).show();
    }
}
