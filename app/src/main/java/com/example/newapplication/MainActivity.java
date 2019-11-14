package com.example.newapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button btnArea,btnPalindrome,btnReserve,btnSwap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //Binding
        btnArea = findViewById(R.id.btnAreaOfCircle);
        btnPalindrome = findViewById(R.id.btnPalindromeNo);
        btnReserve = findViewById(R.id.btnReverse);
        btnSwap = findViewById(R.id.btnSwap);

        btnArea.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,AreaOfCircleActivity.class);
                startActivity(intent);
            }
        });

        btnPalindrome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,PalindromeActivity.class);
                startActivity(intent);
            }
        });

        btnReserve.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,ReverseANoActivity.class);
                startActivity(intent);
            }
        });

        btnSwap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,SwapActivity.class);
                startActivity(intent);
            }
        });
    }
}
