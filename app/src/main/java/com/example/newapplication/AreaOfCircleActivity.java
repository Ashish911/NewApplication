package com.example.newapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class AreaOfCircleActivity extends AppCompatActivity {

    EditText etRadius;
    Button btnCalculate;
    TextView tvOutput;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_area_of_circle);

        etRadius = findViewById(R.id.etRadius);
        btnCalculate = findViewById(R.id.btnCalculateArea);
        tvOutput = findViewById(R.id.tvOutputArea);

        btnCalculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (TextUtils.isEmpty(etRadius.getText())){
                    etRadius.setError("Enter Radius");
                    return;
                }

                int Radius;

                double result;
                Radius = Integer.parseInt(etRadius.getText().toString());

                Area area = new Area();
                area.setRadius(Radius);
                result = area.AreaCircle();
                tvOutput.setText("Area is : ".concat(Double.toString(result)));
            }
        });
    }
}
