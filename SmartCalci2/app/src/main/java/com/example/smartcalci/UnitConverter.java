package com.example.smartcalci;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

public class UnitConverter extends AppCompatActivity {

    private EditText inputEditText;
    private TextView resultTextView;
    private Spinner fromSpinner, toSpinner;
    private Button convertButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_unit_converter);

        inputEditText = findViewById(R.id.input);
        resultTextView = findViewById(R.id.result);
        fromSpinner = findViewById(R.id.from_spinner);
        toSpinner = findViewById(R.id.to_spinner);
        convertButton = findViewById(R.id.convert_button);

        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(
                this, R.array.units, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        fromSpinner.setAdapter(adapter);
        toSpinner.setAdapter(adapter);

        convertButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                convert();
            }
        });
    }
    private void convert() {
        String from = fromSpinner.getSelectedItem().toString();
        String to = toSpinner.getSelectedItem().toString();
        double value = Double.parseDouble(inputEditText.getText().toString());
        double result;

        if (from.equals("Kilometers") && to.equals("Miles")) {
            result = value * 0.621371;
        } else if (from.equals("Miles") && to.equals("Kilometers")) {
            result = value / 0.621371;
        } else if (from.equals("Kilometers") && to.equals("Meters")) {
            result = value * 1000;
        }  else if (from.equals("Kilometers") && to.equals("Centimeters")) {
            result = value * 100000;
        } else if (from.equals("Kilometers") && to.equals("Grams")) {
            result = 00.00;
        }else if (from.equals("Kilometers") && to.equals("Liters")) {
            result = 00.00;
        }else if (from.equals("Kilometers") && to.equals("Milliliters")) {
            result = 00.00;
        }else if (from.equals("Grams") && to.equals("Milliliters")) {
            result = 00.00;
        }else if (from.equals("Centimeters") && to.equals("Milliliters")) {
            result = 00.00;
        }else if (from.equals("Miles") && to.equals("Milliliters")) {
            result = 00.00;
        }else if (from.equals("Kilometers") && to.equals("Kilograms")) {
            result = 00.00;
        }else if (from.equals("Kilograms") && to.equals("Liters")) {
            result = 00.00;
        }else if (from.equals("Kilometers") && to.equals("Gallons")) {
            result = 00.00;
        }else if (from.equals("Kilometers") && to.equals("Fluid ounces")) {
            result = 00.00;
        }else if (from.equals("Kilometers") && to.equals("Ounces")) {
            result = 00.00;
        }else if (from.equals("Kilometers") && to.equals("Celsius")) {
            result = 00.00;
        }else if (from.equals("Kilograms") && to.equals("Milliliters")) {
            result = 00.00;
        }else if (from.equals("Kilograms") && to.equals("Celsius")) {
            result = 00.00;
        }else if (from.equals("Kilometers") && to.equals("Pounds")) {
            result = 00.00;
        }else if (from.equals("Meters") && to.equals("Kilometers")) {
            result = value / 1000;
        } else if (from.equals("Kilometers") && to.equals("Feet")) {
            result = value * 3280.84;
        } else if (from.equals("Feet") && to.equals("Kilometers")) {
            result = value / 3280.84;
        } else if (from.equals("Miles") && to.equals("Meters")) {
            result = value * 1609.34;
        } else if (from.equals("Meters") && to.equals("Miles")) {
            result = value / 1609.34;
        } else if (from.equals("Miles") && to.equals("Feet")) {
            result = value * 5280;
        } else if (from.equals("Feet") && to.equals("Miles")) {
            result = value / 5280;
        } else if (from.equals("Meters") && to.equals("Feet")) {
            result = value * 3.28084;
        } else if (from.equals("Feet") && to.equals("Meters")) {
            result = value / 3.28084;
        } else {
            result = value;
        }

        resultTextView.setText(String.format("%.2f %s = %.2f %s", value, from, result, to));
    }
}









