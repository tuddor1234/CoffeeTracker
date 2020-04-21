package com.example.coffeetracker;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.text.Layout;

import com.example.coffeetracker.ui.CoffeePickerFragment;
import com.example.coffeetracker.ui.StatisticsFragment;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        CoffeePickerFragment cfp = new CoffeePickerFragment();
//
//        FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
//
//        ft.add(R.id.frame,cfp).commit();
//

        StatisticsFragment statisticsFragment = new StatisticsFragment();

        FragmentTransaction ft = getSupportFragmentManager().beginTransaction();

        ft.add(R.id.frame,statisticsFragment).commit();



    }
}
