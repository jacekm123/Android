package pl.com.wwsis.layouty.adaptery;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.TextView;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import pl.com.wwsis.layouty.R;

/**
 * Created by a051213 on 2015-04-09.
 */
public class ColorAdapter extends BaseAdapter {
    private static final int PADDING = 6;
    private static final int WIDTH = 200;
    private static final int HEIGHT = 200;

    private final Context context;
    private final List<String> colors;

    private static final Map<String, Integer> colorMap = new HashMap<>();

    static {
        colorMap.put("Czerwony", R.color.Czerwony);
        colorMap.put("Czarny", R.color.Czarny);
        colorMap.put("Brazowy", R.color. Brazowy);
        colorMap.put("Niebieski", R.color.Niebieski);
        colorMap.put("Zielony", R.color.Zielony);
        colorMap.put("Morelowy", R.color.Morelowy);
        colorMap.put("PiaskiPustyni", R.color.PiaskiPustyni);
    }


    public ColorAdapter(Context context, List<String> colors) {
        this.context = context;
        this.colors = colors;
    }


    @Override
    public int getCount() {
        return colors.size();
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    // metoda jest wywoływana przez androida w przypadku wyświetlenia danego widoku (convertView)
    public View getView(int position, View convertView, ViewGroup parent) {
        TextView textView = (TextView) convertView;

        if(textView == null) {
            textView = new TextView(context);
            textView.setLayoutParams(new GridView.LayoutParams(WIDTH, HEIGHT));
            textView.setPadding(PADDING, PADDING, PADDING, PADDING);

            System.out.println(position + ", " + colors.get(position));
            Integer color = colorMap.get(colors.get(position));
            if(color == null) {
                textView.setText("Brak zdefiniowanego koloru");
            } else {
                textView.setBackgroundResource(color);
            }
        }


        return textView;
    }

}
