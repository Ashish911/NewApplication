package com.example.newapplication;

public class Swap {

    private int First;
    private int Second;

    public int getFirst() {
        return First;
    }

    public void setFirst(int first) {
        First = first;
    }

    public int getSecond() {
        return Second;
    }

    public void setSecond(int second) {
        Second = second;
    }

    public void SwapNo(){
        First = First + Second;
        Second = First - Second;
        First = First - Second;
    }
}
