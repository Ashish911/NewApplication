package com.example.newapplication;

public class Area {

    //Properties
    private int Radius;
    //Constructor

    //Behavior
    public double AreaCircle(){
        return Math.PI * Radius * Radius;
    }

    public int getRadius() {
        return Radius;
    }

    public void setRadius(int radius) {
        Radius = radius;
    }
}
