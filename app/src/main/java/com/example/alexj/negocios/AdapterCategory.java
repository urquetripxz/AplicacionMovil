package com.example.alexj.negocios;
import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import com.example.alexj.negocios.R;import java.util.ArrayList;

/**
 * Created by alexj on 11/11/2016.
 */

public class AdapterCategory extends BaseAdapter {

    protected Activity activity;
    protected ArrayList<Category> items;

            public AdapterCategory(Activity activity, ArrayList<Category> items) {
        this.activity = activity;
        this.items = items;
        }

            @Override
    public int getCount() {
        return items.size();
        }

            public void clear() {
        items.clear();
        }

            public void addAll(ArrayList<Category> category) {
        for (int i = 0; i < category.size(); i++) {
            items.add(category.get(i));
            }
        }

            @Override
    public Object getItem(int arg0) {
        return items.get(arg0);
        }

            @Override
    public long getItemId(int position) {
        return position;
        }
            @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View v = convertView;
        if (convertView == null) {
            LayoutInflater inf = (LayoutInflater) activity.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            v = inf.inflate(R.layout.favoritos, null);
            }

        Category dir = items.get(position);
        TextView title = (TextView) v.findViewById(R.id.category);
        title.setText(dir.getTitle());
        TextView description = (TextView) v.findViewById(R.id.texto);
        description.setText(dir.getDescription());
        ImageView imagen = (ImageView) v.findViewById(R.id.imageView4);
        imagen.setImageDrawable(dir.getImagen());
        return v;
        }
}
