package com.example.liveharshit.spider;

import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class SignUp extends AppCompatActivity {
    Button b1;
    EditText e1,e2,e3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);
        b1=(Button)findViewById(R.id.button);
        e1=(EditText)findViewById(R.id.editText3);
        e2=(EditText)findViewById(R.id.editText6);
        e3=(EditText)findViewById(R.id.editText7);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String s1=e1.getText().toString();
                String s2=e2.getText().toString();
                String s3=e3.getText().toString();
                if(s1.equals("")||s2.equals("")||s3.equals("")) {
                    Toast.makeText(SignUp.this, "Fill all", Toast.LENGTH_SHORT).show();
                }
                else {
                    SQLiteDatabase data=openOrCreateDatabase("function",MODE_PRIVATE,null);
                    data.execSQL("create table if not exists student(username varchar,email varchar,password varchar)");
                    String s="select * from student where username='"+s1+"'";
                    Cursor cursor=data.rawQuery(s,null);
                    if(cursor.getCount()>0) {
                        Toast.makeText(SignUp.this, "Username already exist", Toast.LENGTH_SHORT).show();
                    }
                    else {
                        data.execSQL("insert into student values ('"+s1+"','"+s2+"','"+s3+"')");
                        Toast.makeText(SignUp.this, "Signup Done", Toast.LENGTH_SHORT).show();
                        Intent c=new Intent(SignUp.this,Home.class);
                        startActivity(c);
                        finish();
                    }
                }
            }
        });


    }

    @Override
    public void onBackPressed() {
        Intent d = new Intent(SignUp.this,MainActivity.class);
        startActivity(d);
        finish();
    }
}
