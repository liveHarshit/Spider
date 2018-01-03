package com.example.liveharshit.spider;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class AboutMe extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about_me);
    }

    @Override
    public void onBackPressed() {
        Intent f =new Intent(AboutMe.this,Home.class);
        startActivity(f);
        finish();
    }
}
