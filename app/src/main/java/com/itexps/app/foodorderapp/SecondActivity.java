package com.itexps.app.foodorderapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        //find the textView element in SecondActivity layout
        TextView txtOrder= (TextView)findViewById(R.id.txtOrder);

        //get the data that has sent from main activity
        String foodName=getIntent().getStringExtra("foodName");

        //show the food name in textview
        txtOrder.setText(foodName);
    }
}
