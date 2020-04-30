package com.example.coffeetracker;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.text.Layout;

import com.example.coffeetracker.ui.CoffeePickerFragment;
import com.example.coffeetracker.ui.StatisticsFragment;


public class MainActivity extends AppCompatActivity {

    private int frameIndex;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }
}
