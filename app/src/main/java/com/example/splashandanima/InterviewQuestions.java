package com.example.splashandanima;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class InterviewQuestions extends AppCompatActivity {
        TextView xx,yy,ques,ans;
        int index;
        Button pre,n2,next;
        String[] question,answere;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_interview_questions);
        xx=findViewById(R.id.textView5);
        yy=findViewById(R.id.textView4);
        ques=findViewById(R.id.textView7);
        ans=findViewById(R.id.textView6);
        pre=findViewById(R.id.button4);
        n2=findViewById(R.id.button);
        next=findViewById(R.id.button2);
        question = getResources().getStringArray(R.array.question);
        answere = getResources().getStringArray(R.array.answere);

        ques.setText(question[index]);
        ans.setText("Press Answer button to show answer");
        xx.setText(String.valueOf(index+1));
        yy.setText("/"+ String.valueOf(5));


    }
    public void onClick(View v)
    {
        switch (v.getId()){
            case  R.id.button4:
                if(index==0)
                {
                    Toast.makeText(this, "No previous", Toast.LENGTH_SHORT).show();
                    break;
                }
                ans.setText("Press Answer button to show answer");
                index--;
                ques.setText(question[index]);
                xx.setText(String.valueOf(index+1));
                break;

            case R.id.button:
                ans.setText(answere[index]);

                break;
            case R.id.button2:

                ans.setText("Press Answer button to show answer");
                index++;
                if(index==5) {

                    Toast.makeText(this, "INTERVIEW FINISHED", Toast.LENGTH_SHORT).show();
                    Intent intent = new Intent(getApplicationContext(), Questions.class);
                    startActivity(intent);
                    break;
                }
                ques.setText(question[index]);
                xx.setText(String.valueOf(index+1));

                break;
                }

        }
    }
