package com.example.newapplication;

public class Reverse {

    private int Reverse;

    public int getReverse() {
        return Reverse;
    }

    public void setReverse(int reverse) {
        Reverse = reverse;
    }

    public int ReverseNumber(){
        int ReversedNo = 0, Remainder;

        while (Reverse != 0 ){
            Remainder = Reverse % 10;
            ReversedNo = ReversedNo * 10 + Remainder;
            Reverse = Reverse/10;
        }
        return ReversedNo;
    }
}
