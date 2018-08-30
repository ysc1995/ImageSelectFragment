package com.example.shaochengyang.imageselectfragment;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class Fragtwo extends Fragment {
    int[] myPictures = {R.drawable.china,R.drawable.india,R.drawable.usa,R.drawable.japan,R.drawable.nepal};
    ImageView countrybig;


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.frag2,container,false);
        countrybig =view.findViewById(R.id.countrymapbig);

        countrybig.setImageResource(myPictures[getArguments().getInt("mybundle")]);

        return view;
    }

    //public void showmap(int position){
        //Toast.makeText(getActivity(),"nihao",Toast.LENGTH_LONG).show();
        //textView.setText(position);
        //countrybig.setImageResource(R.drawable.nepal);
        //countrybig.setImageResource(myPictures[position]);
    //}
}
