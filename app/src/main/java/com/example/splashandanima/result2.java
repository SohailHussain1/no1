package com.example.splashandanima;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class result2 extends AppCompatActivity {
    Button end, Try;
    TextView correct, wrong;
    int s1, s2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result2);

            end = findViewById(R.id.button12);
            Try = findViewById(R.id.button11);
            correct = findViewById(R.id.textView19);
            wrong = findViewById(R.id.textView20);
            Intent in = getIntent();
            s1 = in.getIntExtra("Correct", 0);
            correct.setText("CORRECT ANSWERS = " + s1);
            s2 = in.getIntExtra("Incorrect", 0);
            wrong.setText("INCORRECT ANSWERS = " + s2);
            end.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent intent = new Intent(result2.this, Questions.class);
                    startActivity(intent);
                }
            });
            Try.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent intent = new Intent(result2.this, quizes.class);
                    startActivity(intent);
                }
            });
        }
    }

