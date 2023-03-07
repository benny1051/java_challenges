package com.company;
//Create a function that takes three integer arguments (a, b, c) and returns the amount of integers which are of equal value.
public class equalityOf3Values {
    public int equal(int a, int b, int c) {
        if(a == b && a == c){ // Check if all values are the same.
            return 3;
        }else if(a == b || a==c || b==c){ // If all values not the same, then check if there is a pair that matches.
            return 2;
        }
        return 0; // if noone matches at all, then return 0;
    }
}

