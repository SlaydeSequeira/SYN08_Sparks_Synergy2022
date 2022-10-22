package com.example.sparks;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainPage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_page);
        Button loginbtn=(Button) findViewById(R.id.confirm_button);
        Button loginbtn1=(Button) findViewById(R.id.confirm_button2);
        Button loginbtn2=(Button) findViewById(R.id.buttonPanel);
        loginbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               payment();
            }
        });
        loginbtn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                payment();
            }
        });
        loginbtn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                results();
            }

        });
    }
    public void payment(){
        Intent intent =new Intent(this,payment.class);
        startActivity(intent);
    }
    private void results() {
        Intent intent =new Intent(this,Results.class);
        startActivity(intent);
    }
}