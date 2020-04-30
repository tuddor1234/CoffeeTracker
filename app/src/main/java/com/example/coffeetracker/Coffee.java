package com.example.coffeetracker;

import androidx.annotation.NonNull;

import org.json.JSONException;
import org.json.JSONObject;

public class Coffee {

    private int score;

    private int cafeine;
    private int sugar = 0;
    private int milk = 0;
    private int amount;

    private boolean hasLiqure;

    protected Coffee(int cofeine, int sugar , int milk) {

        this.cafeine = cofeine;
        this.sugar = sugar;
        this.milk = milk;

        ComputeScore();
    }

    public int getScore() {
        return score;
    }

    public void ComputeScore() {
        score = cafeine + sugar + milk;
    }

    public int getCafeine() {
        return cafeine;
    }

    public int getMilk() {
        return milk;
    }

    public int getSugar() {
        return sugar;
    }

    public void setCafeine(int cafeine) {
        this.cafeine = cafeine;
    }

    public void setMilk(int milk) {
        this.milk = milk;
    }

    public void setSugar(int sugar) {
        this.sugar = sugar;
    }


    public static void drink()
    {
        System.out.println("GLGLGLGLGLGL");
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }


    @NonNull
    @Override
    public String toString() {
        return "Amount: " + amount + "\n Coffeine:" + cafeine + "\n Sugar:" + sugar + "\n Milk: " + milk + "\n Coffee Type:";
    }


    public JSONObject toJSON() throws JSONException {
        JSONObject object = new JSONObject();
        object.put("Amount",amount);
        object.put("Caffeine", cafeine);
        object.put("Sugar",sugar);
        object.put("Milk",milk);

         return object;
    }


}
