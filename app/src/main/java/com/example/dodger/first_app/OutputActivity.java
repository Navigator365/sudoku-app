package com.example.dodger.first_app;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class OutputActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_output);
        Intent intent = getIntent();
        String stringComparisonValue = intent.getStringExtra(VendingMachinePickerActivity.WHICH_BUTTON_PRESSED);

        String inputMoney = intent.getStringExtra(MainActivity.EXTRA_MESSAGE);//this is returning null-was STORED_MESSAGE

        TextView textView = findViewById(R.id.textView3);

        double fillerValue = 0.0;

        /*if(Double.valueOf(stringComparisonValue) == 3.0) {
            if (Double.valueOf(inputMoney) - 1.99 < 0.0) {
                textView.setText(R.string.no_money_string);
            } else {
                fillerValue = Double.valueOf(inputMoney) - 1.99;
                textView.setText(R.string.end_string + String.valueOf(fillerValue));
            }
        }
        if(Double.valueOf(stringComparisonValue) == 4.0) {
            if (Double.valueOf(inputMoney) - 0.50 < 0.0) {
                textView.setText(R.string.no_money_string);
            } else {
                fillerValue = Double.valueOf(inputMoney) - 0.50;
                textView.setText(R.string.end_string + String.valueOf(fillerValue));
            }
        }  if(Double.valueOf(stringComparisonValue) == 5.0) {
            if (Double.valueOf(inputMoney) - 3.50 < 0.0) {
                textView.setText(R.string.no_money_string);
            } else {
                fillerValue = Double.valueOf(inputMoney) - 3.50;
                textView.setText(R.string.end_string + String.valueOf(fillerValue));
            }
        }  if(Double.valueOf(stringComparisonValue) == 6.0) {
            if (Double.valueOf(inputMoney) - 5.47 < 0.0) {
                textView.setText(R.string.no_money_string);
            } else {
                fillerValue = Double.valueOf(inputMoney) - 5.47;
                textView.setText(R.string.end_string + String.valueOf(fillerValue));
            }
        }  if(Double.valueOf(stringComparisonValue) == 7.0) {
            if (Double.valueOf(inputMoney) - 2.99 < 0.0) {
                textView.setText(R.string.no_money_string);
            } else {
                fillerValue = Double.valueOf(inputMoney) - 2.99;
                textView.setText(R.string.end_string + String.valueOf(fillerValue));
            }
        }  if(Double.valueOf(stringComparisonValue) == 8.0) {
            if (Double.valueOf(inputMoney) - 6.54 < 0.0) {
                textView.setText(R.string.no_money_string);
            } else {
                fillerValue = Double.valueOf(inputMoney) - 6.54;
                textView.setText(R.string.end_string + String.valueOf(fillerValue));
            }*/ textView.setText(inputMoney);
        }
}