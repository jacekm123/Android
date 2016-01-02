package com.example.jacek.calculator;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;


public class MainActivity extends ActionBarActivity
{
    public String str ="";
    Character op = 'q';
    double i,num,numtemp;
    EditText oblicz;
    TextView wynik;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        oblicz = (EditText)findViewById(R.id.obliczenia);
        wynik = (TextView)findViewById(R.id.wynik);
    }
    public void btn1Clicked(View v){
        insert(1);
    }
    public void btn2Clicked(View v){
        insert(2);
    }
    public void btn3Clicked(View v){
        insert(3);
    }
    public void btn4Clicked(View v){
        insert(4);
    }
    public void btn5Clicked(View v){
        insert(5);
    }
    public void btn6Clicked(View v){
        insert(6);
    }
    public void btn7Clicked(View v){
        insert(7);
    }
    public void btn8Clicked(View v){
        insert(8);
    }
    public void btn9Clicked(View v){
        insert(9);
    }
    public void btn0Clicked(View v){
        insert(0);
    }
    public void btnDotClicked(View v){
        insertDot('.');
    }
    public void btnplusClicked(View v){
        perform();
        op = '+';
    }
    public void btnminusClicked(View v){
        perform();
        op = '-';
    }
    public void btndivideClicked(View v){
        perform();
        op = '/';
    }
    public void btnmultiClicked(View v){
        perform();
        op = '*';
    }
    public void btnequalClicked(View v){
        calculate();
    }
    public void btnclearClicked(View v){
        reset();
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }



    private void reset() {
        // TODO Auto-generated method stub
        str ="";
        op ='q';
        num = 0;
        numtemp = 0;
        oblicz.setText("");
        wynik.setText("");
    }
    private void insert(int j) {
        // TODO Auto-generated method stub
        str = str + Integer.toString(j);
        num = Double.valueOf(str).doubleValue();
        oblicz.setText(str);
    }

    private void insertDot(char i) {
        // TODO Auto-generated method stub
        str = str + Character.toString(i);
        num = Double.valueOf(str).doubleValue();
        oblicz.setText(str);

    }
    private void perform() {
        // TODO Auto-generated method stub
        str = "";
        numtemp = num;
    }
    private void calculate() {
        // TODO Auto-generated method stub
        if(op == '+')
            num = numtemp+num;
        else if(op == '-')
            num = numtemp-num;
        else if(op == '/')
        {
            if (num == 0){
                str = Integer.toString(0);
                num = Double.valueOf(str).doubleValue();
                oblicz.setText(str);
            }
            else
                num = numtemp / num;
           /*try {
                num = numtemp / num;
            }
            catch (Exception exc) {
                str = Integer.toString(0);
                num = Double.valueOf(str).doubleValue();
                oblicz.setText(str);
                //oblicz.setText("Nie mozna dzielic przez 0!");
                //insert(0);
            }*/
        }
        else if(op == '*')
            num = numtemp*num;
        oblicz.setText("");
        wynik.setText(""+num);
    }
}

//package com.website.androidcalculator;
/*
package com.example.jacek.calculator;

import android.os.Bundle;
import android.app.Activity;
import android.text.TextUtils;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends Activity implements OnClickListener {

    EditText etNum1;
    EditText etNum2;

    Button btnAdd;
    Button btnSub;
    Button btnMult;
    Button btnDiv;

    TextView tvResult;

    String oper = "";


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // find the elements
        etNum1 = (EditText) findViewById(R.id.etNum1);
        etNum2 = (EditText) findViewById(R.id.etNum2);

        btnAdd = (Button) findViewById(R.id.btnAdd);
        btnSub = (Button) findViewById(R.id.btnSub);
        btnMult = (Button) findViewById(R.id.btnMult);
        btnDiv = (Button) findViewById(R.id.btnDiv);

        tvResult = (TextView) findViewById(R.id.tvResult);

        // set a listener
        btnAdd.setOnClickListener((OnClickListener) this);
        btnSub.setOnClickListener(this);
        btnMult.setOnClickListener(this);
        btnDiv.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        // TODO Auto-generated method stub
        float num1 = 0;
        float num2 = 0;
        float result = 0;

        // check if the fields are empty
        if (TextUtils.isEmpty(etNum1.getText().toString())
                || TextUtils.isEmpty(etNum2.getText().toString())) {
            return;
        }

        // read EditText and fill variables with numbers
        num1 = Float.parseFloat(etNum1.getText().toString());
        num2 = Float.parseFloat(etNum2.getText().toString());

        // defines the button that has been clicked and performs the corresponding operation
        // write operation into oper, we will use it later for output
        switch (v.getId()) {
            case R.id.btnAdd:
                oper = "+";
                result = num1 + num2;
                break;
            case R.id.btnSub:
                oper = "-";
                result = num1 - num2;
                break;
            case R.id.btnMult:
                oper = "*";
                result = num1 * num2;
                break;
            case R.id.btnDiv:
                oper = "/";
                result = num1 / num2;
                break;
            default:
                break;
        }

        // form the output line
        tvResult.setText(num1 + " " + oper + " " + num2 + " = " + result);
    }
}
*/

/*
package com.example.jacek.calculator;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.EditText;


public class MainActivity extends ActionBarActivity {

    private EditText Scr;
    private float NumberBf;
    private String Operation;
    private ButtonClickListener btnClick;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Scr = (EditText) findViewById(R.id.editText);
        Scr.setEnabled(false);
        btnClick = new ButtonClickListener();
        int idList[] = {R.id.button,R.id.button2,R.id.button3,
                R.id.button4,R.id.button5,R.id.button6,R.id.button7,
                R.id.button8,R.id.button9,R.id.button10,R.id.button11,
                R.id.button12,R.id.button13,R.id.button14,R.id.button15,
                R.id.button16,R.id.button17};

        for(int id:idList){
            View v = (View) findViewById(id);
            v.setOnClickListener(btnClick);
        }
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    public void mMath (String str){
        NumberBf = Float.parseFloat(Scr.getText().toString());//save the screen
        Operation = str;//save operation
        Scr.setText("0");//Clear screen
    }

    public void getKeyboard (String str){
        String ScrCurrent = Scr.getText().toString();
        if(ScrCurrent.equals("0"))
            ScrCurrent = "";
        ScrCurrent += str;
        Scr.setText(ScrCurrent);
    }

    public void mResult(){
        float NumAf = Float.parseFloat(Scr.getText().toString());
        float result;
        if(Operation.equals("+")){
            result = NumAf + NumberBf;
        }
        if(Operation.equals("-")) {
            result = NumAf - NumberBf;
        }
        if(Operation.equals("*")) {
            result = NumAf * NumberBf;
        }
        if(Operation.equals("/")) {
            result = NumAf / NumberBf;
        }
        Scr.setText(String.valueOf(result));
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    new class ButtonClickListener
    private class ButtonClickListener implements OnClickListener{
        public void onClick(View v){
            switch (v.getId()){
                case R.id.button4: //Clear screen
                    Scr.setText("0");
                    NumberBf = 0;
                    Operation = "";
                    break;
                case R.id.button14:
                    mMath("+");
                    break;
                case R.id.button15:
                    mMath("-");
                    break;
                case R.id.button15:
                    mMath("*");
                    break;
                case R.id.button15:
                    mMath("/");
                    break;
                case R.id.button15:
                    mResult();
                    break;
                default:
                    String numb = ((Button) v).getText().toString();
                    getKeyboard (numb);
                    break;
            }
        }
    }
}
*/