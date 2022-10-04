package com.example.sparks;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button b1 = (Button) findViewById(R.id.dialog_button);
        Button b2 = (Button) findViewById(R.id.dialog_button2);
        Button b3 = (Button) findViewById(R.id.dialog_button3);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                admin();
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                operator();
            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                customer();
            }
        });
    }
    public void admin(){
        Intent intent = new Intent(this,admin.class);
        startActivity(intent);
    }
    public void operator(){
        Intent intent = new Intent(this,operator.class);
        startActivity(intent);
    }
    public void customer(){
        Intent intent = new Intent(this,customer.class);
        startActivity(intent);
    }
}