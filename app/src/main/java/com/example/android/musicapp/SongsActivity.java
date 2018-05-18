package com.example.android.musicapp;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class SongsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_songs);
        Button homeButton = (Button) findViewById(R.id.home_button);
        homeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent homeIntent = new Intent(SongsActivity.this, MainActivity.class);
                startActivity(homeIntent);
            }
        });
        TextView song1Textview = (TextView) findViewById(R.id.song1_textview);
        song1Textview.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent song1Intent = new Intent(SongsActivity.this, PlayerActivity.class);
                startActivity(song1Intent);
            }
        });
        TextView song2Textview = (TextView) findViewById(R.id.song2_textview);
        song2Textview.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent song2Intent = new Intent(SongsActivity.this, PlayerActivity.class);
                startActivity(song2Intent);
            }
        });
        TextView song3Textview = (TextView) findViewById(R.id.song3_textview);
        song3Textview.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent song3Intent = new Intent(SongsActivity.this, PlayerActivity.class);
                startActivity(song3Intent);
            }
        });
        TextView song4Textview = (TextView) findViewById(R.id.song4_textview);
        song4Textview.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent song4Intent = new Intent(SongsActivity.this, PlayerActivity.class);
                startActivity(song4Intent);
            }
        });
    }
}
