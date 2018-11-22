package com.example.dodger.first_app;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class VendingMachinePickerActivity extends AppCompatActivity {
    public static final String whichButtonPressed = "com.example.vending_machine.buttonPressed";
    double comparisonValue = 0;
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
        Intent intent = new Intent(this, OutputActivity.class);

        Button button3 = findViewById(R.id.button3);
        Button button4 = findViewById(R.id.button4);
        Button button5 = findViewById(R.id.button5);
        Button button6 = findViewById(R.id.button6);
        Button button7 = findViewById(R.id.button7);
        Button button8 = findViewById(R.id.button8);

        setClickListener(button3, 1.99, 3);
        setClickListener(button4, 0.50, 4);
        setClickListener(button5, 3.50, 5);
        setClickListener(button6, 5.47, 6);
        setClickListener(button7, 2.99, 7);
        setClickListener(button8, 6.54, 8);

        intent.putExtra(whichButtonPressed, comparisonValue);
        startActivity(intent);
    }

    private void setClickListener(Button listenerObject, final double price, final double buttonNumberValue) {
        Intent intent = new Intent(this, OutputActivity.class);
        final String message = intent.getStringExtra(MainActivity.EXTRA_MESSAGE);
        listenerObject.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                    /*comparisonValue -= price;
                    TextView textView = findViewById(R.id.textView);
                    textView.setText(String.valueOf(comparisonValue));
            }*/
                    comparisonValue = buttonNumberValue;
            }
        });
    }
}
