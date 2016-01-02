package application.zadanie;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import org.json.JSONException;
import org.json.JSONObject;

import java.net.MalformedURLException;
import java.net.URL;

import application.zadanie.Additional.GetIPJsonObject;

public class MainActivity extends Activity implements GetIPJsonObject.Listener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.main_activity);
    }

    public void onGetIP(View view) {

        ((TextView)findViewById(R.id.my_ip_text_view)).setText("Retriving data...");

        try
        {
            new GetIPJsonObject(this).execute(new URL("http://ip.jsontest.com/"));
        }
        catch (MalformedURLException exception)
        {
            exception.printStackTrace();
        }
    }

    @Override
    public void onDone(JSONObject dataSet)
    {
        try
        {
            String ip = dataSet.getString("ip");

            ((TextView)findViewById(R.id.my_ip_text_view)).setText(dataSet.toString() + " ---> " + ip);
        }
        catch(JSONException e)
        {
            e.printStackTrace();
        }
    }
}
