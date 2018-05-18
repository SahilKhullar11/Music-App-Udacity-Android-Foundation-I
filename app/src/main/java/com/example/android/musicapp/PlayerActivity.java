package com.example.android.musicapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class PlayerActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_player);
        Button homeButton = (Button) findViewById(R.id.home_button);
        homeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent homeIntent = new Intent(PlayerActivity.this, MainActivity.class);
                startActivity(homeIntent);
            }
        });
        TextView preiousTextview = (TextView) findViewById(R.id.previous_textview);
        preiousTextview.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(PlayerActivity.this, "Previous song", Toast.LENGTH_SHORT).show();
            }
        });
        TextView pauseTextview = (TextView) findViewById(R.id.pause_textview);
        pauseTextview.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(PlayerActivity.this, "Pause song", Toast.LENGTH_SHORT).show();
            }
        });
        TextView nextTextview = (TextView) findViewById(R.id.next_textview);
        nextTextview.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(PlayerActivity.this, "Next song", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
