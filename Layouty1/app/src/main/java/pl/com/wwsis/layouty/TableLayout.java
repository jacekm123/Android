package pl.com.wwsis.layouty;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;


public class TableLayout extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_table_layout);
    }




    public void ustaw_czerwony(View v){
        TextView kolor = (TextView) findViewById(R.id.fill_color);
        kolor.setBackgroundColor(getResources().getColor(R.color.red));

    }
    public void ustaw_zolty(View v){
        TextView kolor = (TextView) findViewById(R.id.fill_color);
        kolor.setBackgroundColor(getResources().getColor(R.color.yellow));
    }
    public void ustaw_niebieski(View v){
        TextView kolor = (TextView) findViewById(R.id.fill_color);
        kolor.setBackgroundColor(getResources().getColor(R.color.dark_blue));
    }
    public void wyczysc(View v){
        TextView kolor = (TextView) findViewById(R.id.fill_color);
        kolor.setBackgroundColor(getResources().getColor(R.color.Bialy));
    }

}
