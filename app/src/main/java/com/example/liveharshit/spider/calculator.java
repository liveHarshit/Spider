package com.example.liveharshit.spider;

import android.content.Intent;
import android.speech.tts.TextToSpeech;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Locale;

public class calculator extends AppCompatActivity {
    Button b1,b2,b3,b4,b5,b6;
    EditText e1,e2;
    TextToSpeech t1;
    TextView t;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculator);
        b1=(Button)findViewById(R.id.button11);
        b2=(Button)findViewById(R.id.button17);
        b3=(Button)findViewById(R.id.button18);
        b4=(Button)findViewById(R.id.button19);
        b5=(Button)findViewById(R.id.button20);
        b6=(Button)findViewById(R.id.button21);
        e1=(EditText)findViewById(R.id.editText5);
        e2=(EditText)findViewById(R.id.editText8);
        t=(TextView)findViewById(R.id.textView19);
        t1=new TextToSpeech(this, new TextToSpeech.OnInitListener() {
            @Override
            public void onInit(int i) {
                t1.setLanguage(Locale.ENGLISH);
                t1.setSpeechRate(0.3f);
            }
        });


        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String s1=e1.getText().toString();
                String s2=e2.getText().toString();
                if(s1.equals("")||s1.equals("")) {
                    Toast.makeText(calculator.this, "Fill all", Toast.LENGTH_SHORT).show();
                }
                else {
                    int i = Integer.parseInt(s1);
                    int j = Integer.parseInt(s2);
                    int k = i + j;
                    String a1 = String.valueOf(k);
                    t1.speak(a1, TextToSpeech.QUEUE_FLUSH, null);
                    t.setText(a1);
                }
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String s1=e1.getText().toString();
                String s2=e2.getText().toString();
                if(s1.equals("")||s1.equals("")) {
                    Toast.makeText(calculator.this, "Fill all", Toast.LENGTH_SHORT).show();
                }
                else {
                    int i = Integer.parseInt(s1);
                    int j = Integer.parseInt(s2);
                    int k = i - j;
                    String a1 = String.valueOf(k);
                    t1.speak(a1, TextToSpeech.QUEUE_FLUSH, null);
                    t.setText(a1);
                }
            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String s1=e1.getText().toString();
                String s2=e2.getText().toString();
                if(s1.equals("")||s1.equals("")) {
                    Toast.makeText(calculator.this, "Fill all", Toast.LENGTH_SHORT).show();
                }
                else {
                    int i = Integer.parseInt(s1);
                    int j = Integer.parseInt(s2);
                    int k = i * j;
                    String a1 = String.valueOf(k);
                    t1.speak(a1, TextToSpeech.QUEUE_FLUSH, null);
                    t.setText(a1);
                }
            }
        });
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String s1=e1.getText().toString();
                String s2=e2.getText().toString();
                if(s1.equals("")||s1.equals("")) {
                    Toast.makeText(calculator.this, "Fill all", Toast.LENGTH_SHORT).show();
                }
                else {
                    int i = Integer.parseInt(s1);
                    int j = Integer.parseInt(s2);
                    int k = i / j;
                    String a1 = String.valueOf(k);
                    t1.speak(a1, TextToSpeech.QUEUE_FLUSH, null);
                    t.setText(a1);
                }
            }
        });
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String s1=e1.getText().toString();
                String s2=e2.getText().toString();
                if(s1.equals("")||s1.equals("")) {
                    Toast.makeText(calculator.this, "Fill all", Toast.LENGTH_SHORT).show();
                }
                else {
                    int i = Integer.parseInt(s1);
                    int j = Integer.parseInt(s2);
                    int k = i % j;
                    String a1 = String.valueOf(k);
                    t1.speak(a1, TextToSpeech.QUEUE_FLUSH, null);
                    t.setText(a1);
                }
            }
        });
        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                t.setText("");
                e1.setText(null);
                e2.setText(null);
            }
        });


    }

    @Override
    public void onBackPressed() {
        Intent i=new Intent(calculator.this,Home.class);
        startActivity(i);
        finish();
    }
}
