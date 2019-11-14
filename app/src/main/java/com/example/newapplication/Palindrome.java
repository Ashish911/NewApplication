package com.example.newapplication;

public class Palindrome {

    private int Palindrome;


    public void setPalindrome(int palindrome) {
        Palindrome = palindrome;
    }

    public int getPalindrome() {
        return Palindrome;
    }

    public String CheckPalindrome(){

        int remainder;
        int reserve = 0;
        int P = Palindrome;

        while( Palindrome != 0 )
        {
            remainder = Palindrome % 10;
            reserve = reserve * 10 + remainder;
            Palindrome  /= 10;
        }

        if (reserve == P){
            return P + " is a Palindrome No";
        } else {
            return P + " is not a Palindrome No";
        }

    }


}
