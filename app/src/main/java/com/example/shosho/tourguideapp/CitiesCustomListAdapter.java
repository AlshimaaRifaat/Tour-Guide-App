package com.example.shosho.tourguideapp;

/**
 * Created by shosho on 12/5/2017.
 */


import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class CitiesCustomListAdapter extends ArrayAdapter<Citiesclass> {

    Context context;
    ArrayList<Citiesclass> cities;

    public CitiesCustomListAdapter(Context context, int resource, ArrayList<Citiesclass> objects) {
        super(context, resource, objects);
        this.context = context;
        this.cities = objects;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View v = convertView;
        if (v == null) {
            LayoutInflater vi;
            vi = LayoutInflater.from(getContext());
            v = vi.inflate(R.layout.cities_layout, null);
        }
        Citiesclass citiesclass=getItem(position);
        TextView txtTitle = (TextView) v.findViewById(R.id.text_name);
        ImageView imageView = (ImageView) v.findViewById(R.id.imageView);
        TextView extratxt = (TextView) v.findViewById(R.id.text_description);
        txtTitle.setText(citiesclass.getItemname());
        imageView.setImageResource(citiesclass.getImgid());
        extratxt.setText(citiesclass.getDescription());
        return v;
    }
}