package com.example.omedoanate.Model;

public class Recycler_model_showall {

    String title , darkhasti , donateshode;
    int image;

    public Recycler_model_showall(String title, String darkhasti, String donateshode, int image) {
        this.title = title;
        this.darkhasti = darkhasti;
        this.donateshode = donateshode;
        this.image = image;
    }

    public Recycler_model_showall() {
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDarkhasti() {
        return darkhasti;
    }

    public void setDarkhasti(String darkhasti) {
        this.darkhasti = darkhasti;
    }

    public String getDonateshode() {
        return donateshode;
    }

    public void setDonateshode(String donateshode) {
        this.donateshode = donateshode;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }
}
