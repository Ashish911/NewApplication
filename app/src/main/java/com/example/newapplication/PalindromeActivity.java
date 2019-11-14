package com.example.newapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class PalindromeActivity extends AppCompatActivity {

    EditText etPalindrome;
    Button btnCheck;
    TextView tvOutput;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_palindrome);

        etPalindrome = findViewById(R.id.etPalindrome);
        btnCheck = findViewById(R.id.btnCheckPalindrome);
        tvOutput = findViewById(R.id.tvOutputPalindrome);

        btnCheck.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (TextUtils.isEmpty(etPalindrome.getText())){
                    etPalindrome.setError("Enter a Number");
                    return;
                }

                int P;
                String result;
                P = Integer.parseInt(etPalindrome.getText().toString());
                Palindrome palindrome = new Palindrome();
                palindrome.setPalindrome(P);
                result = palindrome.CheckPalindrome();
                tvOutput.setText(result);
            }
        });
    }
}
