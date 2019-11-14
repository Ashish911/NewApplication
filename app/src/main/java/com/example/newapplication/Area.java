package com.example.newapplication;

public class Area {

    //Properties
    private int Radius;
    private double pi = 3.14;
    //Constructor

    //Behavior
    public double AreaCircle(){
        return pi * Radius * Radius;
    }

    public int getRadius() {
        return Radius;
    }

    public void setRadius(int radius) {
        Radius = radius;
    }
}
