package com.example.sparks;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class payment extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_payment);
        Button btn =(Button) findViewById(R.id.btn);
        EditText t =(EditText) findViewById(R.id.text1);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                PaymentGatewayStart();
            }
        });
    }
    public void PaymentGatewayStart(){

    }
}