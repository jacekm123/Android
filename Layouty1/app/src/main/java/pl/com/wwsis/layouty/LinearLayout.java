package pl.com.wwsis.layouty;

import android.app.Activity;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;


public class LinearLayout extends ActionBarActivity {




    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_linear_layout);






    }


public void ustaw_kolor(View v) {
     TextView pole = (TextView) findViewById(R.id.kwadrat);
    RadioGroup rg= (RadioGroup) findViewById(R.id.grupa);
     int pozycja = rg.getCheckedRadioButtonId();

    switch (pozycja) {
        case R.id.red:
            pole.setBackgroundColor(getResources().getColor(R.color.red));
            break;
        case R.id.white:
            pole.setBackgroundColor(getResources().getColor(R.color.Bialy));
            break;
        case R.id.blue:
            pole.setBackgroundColor(getResources().getColor(R.color.dark_blue));
            break;
        default:
            pole.setBackgroundColor(getResources().getColor(R.color.red));
            break;
    }
}
 public void anuluj(View v){
     TextView pole = (TextView) findViewById(R.id.kwadrat);
     pole.setBackgroundColor(getResources().getColor(R.color.red));
     RadioButton rb = (RadioButton) findViewById(R.id.red);

     rb.setChecked(true);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        return false;
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


}
