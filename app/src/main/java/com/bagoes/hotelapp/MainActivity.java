package com.bagoes.hotelapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

public class MainActivity extends AppCompatActivity
{
    private ImageView _imageView1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        _imageView1 = findViewById(R.id.imageView1);

        String imageUrl = "https://blog.airpaz.com/wp-content/uploads/alila-seminyak-panoramic-1.png";
        Picasso.with(this).load(imageUrl).into(_imageView1);
    }
}