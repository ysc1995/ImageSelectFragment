package com.example.shaochengyang.imageselectfragment;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class MyAdapter extends BaseAdapter {

    MyInterf myInterf;
    int myImage[];
    String myCountry[];
    Context ctx;

    LayoutInflater layoutInflater;

    public MyAdapter(int[] myImage, String[] myCountry, Context ctx) {
        this.myImage = myImage;
        this.myCountry = myCountry;
        this.ctx = ctx;

        this.layoutInflater = (LayoutInflater)ctx.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    @Override
    public int getCount() {
        return myCountry.length;
    }

    @Override
    public Object getItem(int position) {
        return position;
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(final int position, View convertView, ViewGroup parent) {
        View v = layoutInflater.inflate(R.layout.map_layout,null);
        TextView tv = v.findViewById(R.id.countryText);
        ImageView iv = v.findViewById(R.id.imageView);



        tv.setText(myCountry[position]);
        iv.setImageResource(myImage[position]);


        return v;
    }
}
