package com.example.newapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class ReverseANoActivity extends AppCompatActivity {

    EditText etReverse;
    Button btnReverse;
    TextView tvOutput;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reverse_ano);

        etReverse = findViewById(R.id.etReserve);
        btnReverse = findViewById(R.id.btnReverse);
        tvOutput = findViewById(R.id.tvOutputRevers);

        btnReverse.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (TextUtils.isEmpty(etReverse.getText())){
                    etReverse.setError("Enter No");
                    return;
                }

                int R, result;
                R = Integer.parseInt(etReverse.getText().toString());
                Reverse reverse = new Reverse();
                reverse.setReverse(R);
                result = reverse.ReverseNumber();
                tvOutput.setText(Integer.toString(result));
            }
        });


    }
}
