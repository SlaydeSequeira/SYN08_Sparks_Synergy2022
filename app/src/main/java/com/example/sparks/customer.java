package com.example.sparks;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class customer extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_customer);
        EditText username =(EditText) findViewById(R.id.username);
        EditText password =(EditText) findViewById(R.id.password);
        Button loginbtn=(Button) findViewById(R.id.btn);
        loginbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(username.getText().toString().equals("admin") && password.getText().toString().equals("admin"))
                {
                    Toast.makeText(customer.this,"Login Sucessful",Toast.LENGTH_SHORT).show();
                    MainPage();
                }
                else
                {
                    Toast.makeText(customer.this,"Login Unsucessful",Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
    public void MainPage(){
        Intent intent =new Intent(this,MainPage.class);
        startActivity(intent);
    }
}