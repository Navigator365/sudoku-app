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
        //String inputMoney = getIntent().getExtras().getString(MainActivity.EXTRA_MESSAGE);

        TextView textView = findViewById(R.id.textView3);
        textView.setText(stringComparisonValue);
    }
}