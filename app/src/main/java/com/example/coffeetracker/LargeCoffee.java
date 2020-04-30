package com.example.coffeetracker;

import androidx.annotation.NonNull;

import org.json.JSONException;
import org.json.JSONObject;

public class LargeCoffee extends Coffee {


    public static LargeCoffee Instance = new LargeCoffee(30, 0 , 0);
    

    private LargeCoffee(int coffeine, int sugar, int milk) {
        super(coffeine, sugar, milk);
    }


    @NonNull
    @Override
    public String toString() {
        String s =  super.toString();
        return s + "large\n";
    }


    @Override
    public JSONObject toJSON() throws JSONException {
        JSONObject temp = super.toJSON();
        temp.put("type","large");
        return temp;

    }
}

