package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView OurText;
    Button TheButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //setting the variables to the Layout file
        Button TennisButton = findViewById(R.id.Tennis);
        Button GamingButton = findViewById(R.id.Gaming);
        Button Golf = findViewById(R.id.Golf);

        TennisButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Sport.class);
                intent.putExtra("SportName", "Tennis");
                startActivity(intent);
            }
        });

        GamingButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Sport.class);
                intent.putExtra("SportName", "Gaming");
                startActivity(intent);
            }
        });

        Golf.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Sport.class);
                intent.putExtra("SportName", "Golf");
                startActivity(intent);
            }
        });
    }
}