package com.example.jacek.sumowanie;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;


public class SumActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sum);
    }


    public void buttonClick (View view){
        EditText numX = (EditText) findViewById(R.id.editText);
        EditText numY = (EditText) findViewById(R.id.editText2);
        TextView wynik = (TextView) findViewById(R.id.textView);
        float num1 = Float.parseFloat(numX.getText().toString());
        float num2 = Float.parseFloat(numY.getText().toString());

        //double eq = 0;

        wynik.setText(String.format("Wynik to %.2f", num1 + num2));

        /*switch (view.getId()){
            case R.id.button:
                eq = num1 + num2;
                break;
        }*/


        //wynik.setText((int) eq);
    }
}
