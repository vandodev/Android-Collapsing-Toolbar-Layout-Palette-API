package com.example.collappsingtoobar;

import androidx.appcompat.app.AppCompatActivity;

import androidx.appcompat.widget.Toolbar;
//import android.widget.Toolbar;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;

import java.util.Objects;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toolbar toobar = findViewById(R.id.toolbar);
        setSupportActionBar(toobar);
        Objects.requireNonNull(getSupportActionBar()).setDisplayHomeAsUpEnabled(true);


    }
}
