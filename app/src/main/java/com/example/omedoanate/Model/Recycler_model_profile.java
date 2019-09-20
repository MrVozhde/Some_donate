package com.example.omedoanate.Model;

public class Recycler_model_profile {

    String name , message;
    int cost;

    public Recycler_model_profile(String name, String message, int cost) {
        this.name = name;
        this.message = message;
        this.cost = cost;
    }

    public Recycler_model_profile() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }
}
