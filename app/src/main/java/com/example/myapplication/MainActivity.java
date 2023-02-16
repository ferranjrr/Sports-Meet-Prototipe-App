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
        OurText = findViewById(R.id.textView);
        TheButton = findViewById(R.id.button);

        Button TennisButton = findViewById(R.id.Tennis);

        TennisButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, Sport.class));
            }
        });

        //Setting the OnClick Listener
        TheButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                // What we want to display when button is clicked
                OurText.setText("The Button was Clicked!");
            }
        });
    }
}