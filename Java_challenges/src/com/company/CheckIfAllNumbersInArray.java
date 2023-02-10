package com.company;

public class CheckIfAllNumbersInArray {



    public CheckIfAllNumbersInArray(){ //Atleast once.
        int A[]=new int[]{1,2,2,3,4,5,6,7};
        int K=7;
        System.out.println(solution(A,K));
    }

    public boolean solution(int[] A, int K) {  // A is the array of numbers, K is the end number.
        int n = A.length;
        for (int i = 0; i < n - 1; i++) { //loop for the length of the array.
            if (A[i] + 1 < A[i + 1])        //If the current index +1(example 1+1 for index 0) is less than the index higher. Then return false. Then you are missing one number.
                return false;
        }
        if (A[0] != 1 || A[n - 1] != K) // If index 0 is not the value 1 OR the index last-1 is not equal to K. Then return false.
            return false;
        else
            return true;
    }
}



