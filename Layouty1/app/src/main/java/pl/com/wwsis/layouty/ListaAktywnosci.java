package pl.com.wwsis.layouty;

import android.app.ListActivity;
import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;


public class ListaAktywnosci extends ListActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setListAdapter(new ArrayAdapter<String>(this, R.layout.activity_lista_aktywnosci, getResources().getStringArray(R.array.lista_aktywnosci)));

        ListView lv = getListView();
        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                System.out.println(id);
                Intent activityIntent = null;
                switch((int)id) {
                    case 0:
                        activityIntent = new Intent(ListaAktywnosci.this, LinearLayout.class);
                        break;
                    case 1:
                        activityIntent = new Intent(ListaAktywnosci.this, RelativeLayout.class);
                        break;
                    case 2:
                        activityIntent = new Intent(ListaAktywnosci.this, TableLayout.class);
                        break;
                    case 3:
                        activityIntent = new Intent(ListaAktywnosci.this, GridLayout.class);
                        break;
                }

                if(activityIntent != null) {
                    startActivity(activityIntent);
                }
            }
        });
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_lista_aktywnosci, menu);
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
}
