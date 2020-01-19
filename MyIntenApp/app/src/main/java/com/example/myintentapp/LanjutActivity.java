package com.example.myintentapp;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class LanjutActivity extends AppCompatActivity {
    public static final String EXTRA_DATA = "extra_data";
    TextView tvData;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lanjut);

        tvData = findViewById(R.id.terimadata);

        String text = getIntent().getStringExtra(EXTRA_DATA);
        tvData.setText(text);
    }

}
