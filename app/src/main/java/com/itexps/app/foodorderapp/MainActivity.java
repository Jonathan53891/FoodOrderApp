package com.itexps.app.foodorderapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    //this method is called when Order Button clicked
    public void btnClick (View v) {

        //when this method is called we will find out which radio button is clicked
        RadioGroup radioGroup = (RadioGroup)
                findViewById(R.id.radioGroup);

        //get the Id of the selected radioButton in the radioGroup
        int radioButtonGenderId = radioGroup.getCheckedRadioButtonId();
        RadioButton radioButton = (RadioButton) findViewById(radioButtonGenderId);

        //get the text of the selected radiobutton
        String radioButtonText = radioButton.getText().toString();

        //Call Second Activity
        Intent intent = new Intent(MainActivity.this,SecondActivity.class);
        intent.putExtra("foodName", radioButtonText);
        startActivityForResult(intent, 44);

    }

}
