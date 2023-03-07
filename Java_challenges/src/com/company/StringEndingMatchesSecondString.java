package com.company;

public class StringEndingMatchesSecondString {
    public static boolean checkEnding(String str1, String str2) {
        String substr = str1.substring(str1.length() - str2.length()); // gets the substring of the last letters in the word

        return substr.equals(str2); // Checks to see if the last letters are the same as the ones we got in str2. Then return true
    }
}
