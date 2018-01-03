package com.example.liveharshit.spider;

import android.content.Intent;
import android.speech.tts.TextToSpeech;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.Locale;

public class speak extends AppCompatActivity {
    Button b1,b2;
    EditText t1;
    TextToSpeech t2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_speak);
        b1=(Button)findViewById(R.id.button10);
        b2=(Button)findViewById(R.id.button12);
        t1=(EditText)findViewById(R.id.editText4);
        t2= new TextToSpeech(this, new TextToSpeech.OnInitListener() {
            @Override
            public void onInit(int i) {
                t2.setLanguage(Locale.ENGLISH);
                t2.setSpeechRate(0.5f);
            }
        });
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String s1= t1.getText().toString();
                if(s1.equals("")) {
                    Toast.makeText(speak.this,  "Please fill", Toast.LENGTH_SHORT).show();
                }
                else {
                    t2.speak(s1,TextToSpeech.QUEUE_FLUSH,null);
                }
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                t1.setText(null);
            }
        });
    }

    @Override
    public void onBackPressed() {
        Intent l = new Intent(speak.this,Home.class);
        startActivity(l);
        finish();
    }
}
