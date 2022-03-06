package com.example.splashandanima;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Questions extends AppCompatActivity {
    Button bn1,bn2,bn3,bn4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_questions);

        bn1=findViewById(R.id.button8);
        bn2=findViewById(R.id.button7);
        bn3=findViewById(R.id.button5);
        bn4=findViewById(R.id.button6);

        bn1.getBackground().setAlpha(100);
        bn2.getBackground().setAlpha(100);
        bn3.getBackground().setAlpha(100);
        bn4.getBackground().setAlpha(100);

        bn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(getApplicationContext(), InterviewQuestions.class );
                startActivity(intent);
            }
        });
        bn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri uri = Uri.parse("https://developer.android.com/studio");
                Intent it = new Intent(Intent.ACTION_VIEW,uri);
                startActivity(it);
            }
        });



    }
}