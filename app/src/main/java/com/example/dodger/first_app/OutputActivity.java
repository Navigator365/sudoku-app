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
        String message = intent.getStringExtra(MainActivity.EXTRA_MESSAGE);

        TextView textView = findViewById(R.id.textView3);

        startActivity(intent);
    }

    public void determineIfCanBePurchased(){
        double comparisonPrice = Double.valueOf(getIntent().getStringExtra(MainActivity.EXTRA_MESSAGE));
        Intent intent = getIntent();
        String message = intent.getStringExtra(MainActivity.EXTRA_MESSAGE);

        if(Double.valueOf(message) == 3){
            comparisonPrice -= 1.99;
        }
    }
}