package com.example.estacionvl_tc_003.multiscreen;


import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.estacionvl_tc_003.multiscreen.fragments.DetalleFragment;
import com.example.estacionvl_tc_003.multiscreen.fragments.MasterFragment;

public class MainActivity extends AppCompatActivity {


    MasterFragment master;
    DetalleFragment detail;
    boolean phone, land;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.a_main);


        master = new MasterFragment();
        detail = new DetalleFragment();

        phone = getResources().getBoolean(R.bool.phone);
        land = getResources().getBoolean(R.bool.land);


        FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
        ft.replace(R.id.container1, master);

        if(!phone && land)
            ft.replace(R.id.container2, detail);


        ft.commit();

    }
}
