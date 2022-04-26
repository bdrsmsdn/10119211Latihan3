package com.programmer.a10119211latihan3;

import static com.programmer.a10119211latihan3.DoneActivity.ID_EXTRA_MSG_EXIT;

import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import butterknife.ButterKnife;
import butterknife.OnClick;

// Tanggal Pengerjaan   : 25-April-2022
// Nama                 : Badra Samsudin Ramdan Nugraha
// NIM                  : 10119211
// Kelas                : IF-6
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ButterKnife.bind(this);

        if (getIntent().getBooleanExtra(ID_EXTRA_MSG_EXIT, false)) {
            finish();
        }
    }


    @OnClick(R.id.btnWalkthroughStart)
    void mulai() {
        Intent intent = new Intent(this, com.programmer.a10119211latihan3.LoginCodeActivity.class);
        startActivity(intent);
    }
}