package com.example.newapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class SwapActivity extends AppCompatActivity {

    EditText etFirst,etSecond;
    Button btnSwap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_swap);

        etFirst = findViewById(R.id.etFirst);
        etSecond = findViewById(R.id.etSecond);
        btnSwap = findViewById(R.id.btnSwap);

        btnSwap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                int First, Second;
                First = Integer.parseInt(etFirst.getText().toString());
                Second = Integer.parseInt(etSecond.getText().toString());

                Swap swap = new Swap();
                swap.setFirst(First);
                swap.setSecond(Second);

                swap.SwapNo();
                First = swap.getFirst();
                Second = swap.getSecond();

                etFirst.setText(Integer.toString(First));
                etSecond.setText(Integer.toString(Second));
            }
        });

    }
}
