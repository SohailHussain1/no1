package com.example.splashandanima;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class result1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result1);
        Button end,Try;
        TextView correct,wrong;
        int s1,s2;


            end=findViewById(R.id.button7);
            Try=findViewById(R.id.button6);
            correct=findViewById(R.id.textView9);
            wrong=findViewById(R.id.textView10);
            Intent in=getIntent();
            s1=in.getIntExtra("Correct",0);
            correct.setText("CORRECT ANSWERS = "+s1);
            s2=in.getIntExtra("Incorrect",0);
            wrong.setText("INCORRECT ANSWERS = "+s2);
            end.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent intent=new Intent(result1.this,Questions.class);
                    startActivity(intent);
                }
            });
            Try.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent intent=new Intent(result1.this,quizes.class);
                    startActivity(intent);
                }
            });
        }
    }
