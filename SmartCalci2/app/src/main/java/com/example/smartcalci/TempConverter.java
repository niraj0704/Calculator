package com.example.smartcalci;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class TempConverter extends AppCompatActivity {

    EditText tempET;
    Button convertBtn,resetBtn;
    RadioButton c2f,f2c;
    TextView errorTV;
    RadioGroup radioGroup;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_temp_converter);

        tempET = (EditText) findViewById(R.id.temperatureValue);
        convertBtn = (Button) findViewById(R.id.convertBtn);
        resetBtn = (Button) findViewById(R.id.resetBtn);
        errorTV = (TextView) findViewById(R.id.errorTextView);
        c2f = (RadioButton) findViewById(R.id.cTofRadio); //celsius to fahrenheit radio
        f2c = (RadioButton) findViewById(R.id.fTocRadio); //fahrenheit to celsius radio
        radioGroup  = (RadioGroup) findViewById(R.id.radioGroup) ;

        convertBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (radioGroup.getCheckedRadioButtonId() == -1)
                {
                    errorTV.setText("Please select atleast one conversion method.");
                }
                else
                {
                    if(tempET.getText().toString().equals("") || tempET.getText().toString().equals(null) ){
                        errorTV.setText("Please enter a value in the text box.");
                    }else {
                        //celsius to fahrenheit radio button is clicked
                        if (c2f.isChecked()) {
                            errorTV.setText(null);
                            String value = tempET.getText().toString();
                            Double celsiusValue = Double.parseDouble(value);

                            Double convertedValue = (celsiusValue * 9 / 5) + 32;
                            String all=convertedValue.toString()+" fahrenheit";
                            errorTV.setText(all);

                        }

                        //fahrenheit to celsius radio button is clicked
                        else if (f2c.isChecked()) {
                            errorTV.setText(null);
                            String value = tempET.getText().toString();
                            Double fahrenheitValue = Double.parseDouble(value);

                            Double convertedValue = (fahrenheitValue - 32) * 5 / 9;

                            String al=convertedValue.toString()+" Celsius";
                            errorTV.setText(al);

                        }
                    }
                }


            }
        });

        resetBtn.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view){
                errorTV.setText(null);
                tempET.setText(null);
            }
        });
    }
}











