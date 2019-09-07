package com.example.splashscreen.Adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.splashscreen.DownloadImageFromInternet;
import com.example.splashscreen.main.Place;
import com.example.splashscreen.R;

import java.util.List;

public class Adapter_shopping extends ArrayAdapter {

    public Adapter_shopping(Context context, List objects) {
        super(context, 0, objects);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View listItemView = convertView;

        if(listItemView == null){
            listItemView = LayoutInflater.from(getContext())
                    .inflate(R.layout.adapter_view_shopping, parent, false);
        }
        Place currentItem = (Place) getItem(position);

        new DownloadImageFromInternet((ImageView) listItemView.findViewById(R.id.imageViewAdapter))
                .execute(currentItem.getImageSrc());
        TextView textView = (TextView)listItemView.findViewById(R.id.textViewAdapter);
        textView.setText(currentItem.getName());
        TextView textView1 = (TextView)listItemView.findViewById(R.id.location_view_adapter);
        textView1.setText(currentItem.getLocation());

        return listItemView;
    }
}
