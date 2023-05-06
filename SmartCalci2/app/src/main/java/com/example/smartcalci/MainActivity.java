package com.example.smartcalci;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void calculator(View view)
    {
        Intent i=new Intent(MainActivity.this, Calculator.class);
        startActivity(i);
    }
    public void converter(View view)
    {
        Intent ic=new Intent(MainActivity.this, Converter.class);
        startActivity(ic);
    }
}