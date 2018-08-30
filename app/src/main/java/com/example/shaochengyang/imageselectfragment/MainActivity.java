package com.example.shaochengyang.imageselectfragment;

import android.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements MyInterf{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getFragmentManager().beginTransaction().add(R.id.mainlayout,new Fragone(),"mytag").commit();
        //getFragmentManager().beginTransaction().replace(R.id.mainlayout,new Fragtwo(),"mysectag").commit();

    }



    public void getPosition(int positon) {
        //Fragtwo fragment2 = (Fragtwo)getFragmentManager().findFragmentById(R.id.fragment2);
        //Fragtwo fragment2 = (Fragtwo) getFragmentManager().findFragmentById(R.id.fragment2);
        Fragtwo fragtwo = new Fragtwo();
        Bundle bundle = new Bundle();
        bundle.putInt("mybundle",positon);
        fragtwo.setArguments(bundle);


        getFragmentManager().beginTransaction().replace(R.id.mainlayout,fragtwo,"mysectag").commit();
        //Toast.makeText(getApplication(),"hithere",Toast.LENGTH_LONG).show();




    }
}
