package com.company;

public class MissingNumberInArray {
    public MissingNumberInArray(){
        int A[]=new int[]{1,2,3,4,5,7,8,9};
        System.out.println(solution(A));
    }

    private int solution(int[] A) { //Create a variable sum = 1 which will store the missing number and a counter variable c = 2.
        //Traverse the array from start to end.
        int n= A.length;
        int sum = ((n + 1) * (n + 2)) / 2;  // Calculate the natural sum of all the numbers in the array.
        for (int i = 0; i < n; i++)
            sum -= A[i]; // remove all the numbers in the array. You are left with the exakt number of the missing number because you never removed that one.
        return sum;
    }


    }

