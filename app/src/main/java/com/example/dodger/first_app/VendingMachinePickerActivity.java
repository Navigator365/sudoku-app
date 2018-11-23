package com.example.dodger.first_app;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class VendingMachinePickerActivity extends AppCompatActivity {
    public static final String WHICH_BUTTON_PRESSED = "com.example.vending_machine.buttonPressed";
    public static String stringComparisonValue;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vending_machine_picker);
        // Get the Intent that started this activity and extract the string
        Intent intent = getIntent();
        String message = intent.getStringExtra(MainActivity.EXTRA_MESSAGE);

        // Capture the layout's TextView and set the string as its text
        TextView textView = findViewById(R.id.textView);
        textView.setText(message);
    }

    public void computePurchase(View v) {
        Button button3 = findViewById(R.id.button3);
        Button button4 = findViewById(R.id.button4);
        Button button5 = findViewById(R.id.button5);
        Button button6 = findViewById(R.id.button6);
        Button button7 = findViewById(R.id.button7);
        Button button8 = findViewById(R.id.button8);

        final Intent intent = new Intent(this, OutputActivity.class);
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                stringComparisonValue = String.valueOf(3);
                intent.putExtra(WHICH_BUTTON_PRESSED, stringComparisonValue);
                startActivity(intent);
            }
        });

        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                stringComparisonValue = String.valueOf(4);
                intent.putExtra(WHICH_BUTTON_PRESSED, stringComparisonValue);
                startActivity(intent);
            }
        });
        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                stringComparisonValue = String.valueOf(5);
                intent.putExtra(WHICH_BUTTON_PRESSED, stringComparisonValue);
                startActivity(intent);
            }
        });
        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                stringComparisonValue = String.valueOf(6);
                intent.putExtra(WHICH_BUTTON_PRESSED, stringComparisonValue);
                startActivity(intent);
            }
        });
        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                stringComparisonValue = String.valueOf(7);
                intent.putExtra(WHICH_BUTTON_PRESSED, stringComparisonValue);
                startActivity(intent);
            }
        });
        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                stringComparisonValue = String.valueOf(8);
                intent.putExtra(WHICH_BUTTON_PRESSED, stringComparisonValue);
                startActivity(intent);
            }
        });
    }
}
