package com.example.omedoanate.Model;

public class Recycler_model_profile {

    String name , message , cost;


    public Recycler_model_profile(String name, String message, String cost) {
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

    public String getCost() {
        return cost;
    }

    public void setCost(String cost) {
        this.cost = cost;
    }
}
