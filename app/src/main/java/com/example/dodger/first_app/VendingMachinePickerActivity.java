package com.example.dodger.first_app;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class VendingMachinePickerActivity extends AppCompatActivity {
    public static final String WHICH_BUTTON_PRESSED = "com.example.vending_machine.buttonPressed";
    public static final String CONTINUED_EXTRA_MESSAGE = "com.example.vending_machine.buttonPressed";
    public static String stringComparisonValue;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vending_machine_picker);
        // Get the Intent that started this activity and extract the string
        Intent intent = getIntent();
        String message = intent.getStringExtra(MainActivity.EXTRA_MESSAGE);

       /* Intent intent1 = getIntent();
        String message1 = intent1.getStringExtra(MainActivity.EXTRA_MESSAGE);
        intent1.putExtra(MainActivity.EXTRA_MESSAGE, message1);*/
        // Capture the layout's TextView and set the string as its text
        TextView textView = findViewById(R.id.textView);
        textView.setText(message);

        Button button3 = findViewById(R.id.button3);
        Button button4 = findViewById(R.id.button4);
        Button button5 = findViewById(R.id.button5);
        Button button6 = findViewById(R.id.button6);
        Button button7 = findViewById(R.id.button7);
        Button button8 = findViewById(R.id.button8);


        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               computePurchase(3.0);
            }
        });

        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                computePurchase(4.0);
            }
        });
        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               computePurchase(5.0);
            }
        });
        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                computePurchase(6.0);
            }
        });
        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
              computePurchase(7.0);
            }
        });
        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               computePurchase(8.0);
            }
        });

        //startActivity(intent1);
    }

    public void computePurchase(double buttonNumberValue) {
        Intent intent = new Intent(this, OutputActivity.class);

        stringComparisonValue = String.valueOf(buttonNumberValue);
        intent.putExtra(WHICH_BUTTON_PRESSED, stringComparisonValue);
        startActivity(intent);
    }
}
