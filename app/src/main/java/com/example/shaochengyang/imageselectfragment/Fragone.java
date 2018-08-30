package com.example.shaochengyang.imageselectfragment;

import android.app.Activity;
import android.app.Fragment;
import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

public class Fragone extends Fragment {

    ListView listView;
    MyInterf myInterf;


    String[] myCountries = {"china","india","USA","japan","nepal"};
    int[] myPictures = {R.drawable.china,R.drawable.india,R.drawable.usa,R.drawable.japan,R.drawable.nepal};


    @Override
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        myInterf = (MyInterf)getActivity();
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable final ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.frag1,container,false);
        listView = view.findViewById(R.id.countrylist);

        MyAdapter myAdapter = new MyAdapter(myPictures,myCountries,getActivity());

        listView.setAdapter(myAdapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener(){
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                //Toast.makeText(getActivity(),"hesr",Toast.LENGTH_LONG).show();
                myInterf.getPosition(position);
            }
        });
        return view;
    }
}
