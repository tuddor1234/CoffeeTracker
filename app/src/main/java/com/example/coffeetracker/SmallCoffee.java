package com.example.coffeetracker;

import androidx.annotation.NonNull;

import org.json.JSONException;
import org.json.JSONObject;

public class SmallCoffee extends Coffee {


    public static SmallCoffee Instance = new SmallCoffee(10,0,0);

    private SmallCoffee(int caffeine, int sugar, int milk)
    {
        super(caffeine,sugar,milk);
    }

    @NonNull
    @Override
    public String toString() {
        String s =  super.toString();
        return s + "small\n";
    }


    @Override
    public JSONObject toJSON() throws JSONException {
        JSONObject temp = super.toJSON();
        temp.put("type","small");

        return temp;

    }
}
