package com.example.alexis_oliveira.testappligooglemap;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class MonumentAdapter extends BaseAdapter {

    private final Context mContext;
    private final Monument[] monuments;

    public MonumentAdapter(Context mContext, Monument[] monuments) {
        this.mContext = mContext;
        this.monuments = monuments;
    }


    @Override
    public int getCount() {
        return monuments.length;
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // 1
        final Monument monument = monuments[position];

        // 2
        if (convertView == null) {
            final LayoutInflater layoutInflater = LayoutInflater.from(mContext);
            convertView = layoutInflater.inflate(R.layout.linear_layout_monument, null);
        }

        // 3
        final ImageView imageView = (ImageView)convertView.findViewById(R.id.image);
        final TextView nameTextView = (TextView)convertView.findViewById(R.id.text_nom);


        // 4
        imageView.setImageResource(monument.getImage());
        nameTextView.setText(mContext.getString(monument.getNom()));


        return convertView;
    }


}