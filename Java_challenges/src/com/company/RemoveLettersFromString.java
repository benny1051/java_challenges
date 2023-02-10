package com.company;

import java.util.Arrays;

public class RemoveLettersFromString {

    public RemoveLettersFromString(){
        String S= "CABABD";
        System.out.println(S);
        System.out.println(solution(S));
    }

    public String solution(String S) {
        String newString=S;

            if (newString.contains("AB")|| S.contains("BA")){
                newString = newString.replaceAll("AB", ""); // Can divide even more to search for strings less.
                newString = newString.replaceAll("BA", "");
            }
            if (newString.contains("CD")|| S.contains("DC")){
                newString = newString.replaceAll("CD", "");
                newString = newString.replaceAll("DC", "");
        }
        return newString ;
    }
}
