package application.zadanie.Additional;

import android.os.AsyncTask;

import org.json.JSONException;
import org.json.JSONObject;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class GetIPJsonObject extends AsyncTask<URL, Void, JSONObject>{

    public interface Listener
    {
        void onDone(JSONObject dataSet);
    }

    Listener mListener;

    public GetIPJsonObject(Listener listener)
    {
        mListener = listener;
    }

    @Override
    protected JSONObject doInBackground(URL... params) {

        JSONObject dataSet = null;

        try
        {
            URL url = params[0];

            HttpURLConnection connection = (HttpURLConnection)url.openConnection();

            BufferedReader reader = new BufferedReader(new InputStreamReader(connection.getInputStream()));

            StringBuilder stringBuilder = new StringBuilder();

            String line = null;

            while((line = reader.readLine()) != null)
            {
                stringBuilder.append(line + '\n');
            }

            reader.close();

            try
            {
                dataSet = new JSONObject(stringBuilder.toString()); // "{ "ip": xxx.xxx.xxx.xxx}"
            }
            catch (JSONException e)
            {
                e.printStackTrace();
            }
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }

        return dataSet;
    }

    @Override
    protected void onPostExecute(JSONObject jsonObject) {

        mListener.onDone(jsonObject);
    }
}
