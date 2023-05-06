package com.example.smartcalci;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.GridView;
import android.widget.TextView;
import android.widget.Toast;

import kotlin.text.UStringsKt;

public class Converter extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_converter);


    }

    public void age_calci(View view) {
        Intent a=new Intent(Converter.this, AgeCalculator.class);
        startActivity(a);
    }
    public void temp_convert(View view)
    {
        Intent a1=new Intent(Converter.this, TempConverter.class);
        startActivity(a1);
    }
    public void unit_convert(View view)
    {
        Intent a2=new Intent(Converter.this, UnitConverter.class);
        startActivity(a2);
    }
}