package com.company;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class findingBinaryGap {

    public findingBinaryGap(){

        System.out.println( solution(1041));
    }

    public int solution(int N) {
        int index=0;
        int maxValue=Integer.MIN_VALUE;
        String value = Integer.toBinaryString(N);
        System.out.println(value);
        int counter = 0;
        int[] counters = new int[value.length()]; // Create array for holding counters.
        for (int i = 0; i < value.length(); i++) { // Loop for the lengt of the binary string
            char current = value.charAt(i); // The value at index position in the loop
            if (current == '0') {
                counter += 1; // For every 0 you encounter in a row. Add that value to a place in the arraylist when you encounter first number one
            } else {
                counters[index++]=counter;
                counter = 0;
            }
        }
        for (int i = 0; i < counters.length; i++) {
            if (maxValue<counters[i]){
                maxValue=counters[i];
            }
        }
        return maxValue; // Return the highest counter you could find in the Array of saved counters for numbers of 0.
    }
}
