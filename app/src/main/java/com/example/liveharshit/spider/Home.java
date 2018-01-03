package com.example.liveharshit.spider;

import android.content.Intent;
import android.os.CountDownTimer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Home extends AppCompatActivity {
    private boolean back1;
    Button b1,b2,b3,b4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        b1=(Button)findViewById(R.id.button4);
        b2=(Button)findViewById(R.id.button5);
        b3=(Button)findViewById(R.id.button6);
        b4=(Button)findViewById(R.id.button7);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent e= new Intent(Home.this,AboutMe.class);
                startActivity(e);
                finish();
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent g = new Intent(Home.this,MainActivity.class);
                startActivity(g);
                finish();
            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent f= new Intent(Home.this,calculator.class);
                startActivity(f);
                finish();
            }
        });
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent h= new Intent(Home.this,speak.class);
                startActivity(h);
                finish();
            }
        });
    }

    @Override
    public void onBackPressed() {
        if(!back1) {

            Toast.makeText(Home.this, "Press back again to exit", Toast.LENGTH_SHORT).show();
            back1 = true;
        }
        else {
            super.onBackPressed();
        }
        new CountDownTimer(3000,1000){

            @Override
            public void onTick(long l) {

            }

            @Override
            public void onFinish() {
                back1 = false;
            }
        }.start();
    }
}
