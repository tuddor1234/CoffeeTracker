package com.example.coffeetracker;

import org.json.JSONException;
import org.json.JSONObject;

public class MediumCoffee extends Coffee {

    public static MediumCoffee Instance = new MediumCoffee(20,0,0);

    private MediumCoffee(int caffeine, int sugar, int milk) {
        super(caffeine, sugar, milk);
    }


    @Override
    public String toString() {
        String s =  super.toString();
        return s + "medium\n";
    }

    @Override
    public JSONObject toJSON() throws JSONException {
        JSONObject temp = super.toJSON();
        temp.put("type","medium");

        return temp;

    }
}
