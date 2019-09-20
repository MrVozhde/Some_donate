package com.example.omedoanate.Model;

public class Recycler_model_items {

    String donate , date , name , text;

    public Recycler_model_items(String donate, String date, String name, String text) {
        this.donate = donate;
        this.date = date;
        this.name = name;
        this.text = text;
    }

    public Recycler_model_items() {
    }

    public String getDonate() {
        return donate;
    }

    public void setDonate(String donate) {
        this.donate = donate;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
