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

public class RegisterActivity extends AppCompatActivity {

    private EditText namaEditText;
    private EditText usernameEditText;
    private EditText passwordEditText;
    private EditText konfirmasiPasswordEditText;
    private Button registerButton;
    private TextView sudahPunyaAkunTextView;
    private TextView loginTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        // Mendapatkan referensi ke elemen UI
        namaEditText = findViewById(R.id.edt_nama_register);
        usernameEditText = findViewById(R.id.edt_username_register);
        passwordEditText = findViewById(R.id.edt_buatsandi_reguler);
        konfirmasiPasswordEditText = findViewById(R.id.edt_sandilagi_register);
        registerButton = findViewById(R.id.btn_register);
        sudahPunyaAkunTextView = findViewById(R.id.text3_register);
        loginTextView = findViewById(R.id.text4_register);

        // Menambahkan OnClickListener untuk tombol register
        registerButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Memeriksa apakah input valid sebelum melakukan registrasi
                if (isInputValid()) {
                    // Lakukan logika registrasi di sini (simpan data, panggil API, dll.)

                    // Contoh: Menampilkan Toast bahwa registrasi berhasil
                    Toast.makeText(RegisterActivity.this, "Registrasi Berhasil", Toast.LENGTH_SHORT).show();

                    // Setelah registrasi berhasil, Anda mungkin ingin memulai aktivitas lain atau kembali ke LoginActivity
                    Intent intent = new Intent(RegisterActivity.this, LoginActivity.class);
                    startActivity(intent);
                    finish();
                } else {
                    // Menampilkan pesan kesalahan jika input tidak valid
                    showErrorMessage("Input tidak valid. Harap isi semua kolom dan pastikan password cocok.");
                }
            }
        });

        // Menambahkan OnClickListener untuk teks "Sudah Punya Akun"
        loginTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Intent untuk memulai LoginActivity
                Intent intent = new Intent(RegisterActivity.this, LoginActivity.class);
                startActivity(intent);
            }
        });
    }

    // Fungsi untuk memeriksa apakah input registrasi valid
    private boolean isInputValid() {
        String nama = namaEditText.getText().toString().trim();
        String username = usernameEditText.getText().toString().trim();
        String password = passwordEditText.getText().toString().trim();
        String konfirmasiPassword = konfirmasiPasswordEditText.getText().toString().trim();

        // Memeriksa apakah input kosong dan apakah password cocok dengan konfirmasi password
        return !TextUtils.isEmpty(nama) && !TextUtils.isEmpty(username) &&
                !TextUtils.isEmpty(password) && !TextUtils.isEmpty(konfirmasiPassword) &&
                password.equals(konfirmasiPassword);
    }

    // Fungsi untuk menampilkan pesan kesalahan menggunakan Toast
    private void showErrorMessage(String message) {
        Toast.makeText(RegisterActivity.this, message, Toast.LENGTH_SHORT).show();
    }
}
