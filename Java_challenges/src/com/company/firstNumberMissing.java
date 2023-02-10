package com.company;

public class firstNumberMissing {

    public firstNumberMissing(){
        int[] array = new int[]{1,3,6,4,1,2};


        System.out.println(solution(array));
    }

    private int solution(int[] A) {

            int n = A.length; // N is length of array.

            int N = 1000010; //Lenght of booleans

            boolean[] present = new boolean[N]; // Create a boolean with all false.

            int maxele = Integer.MIN_VALUE; // Set set the int to lowest possible.


            for (int i = 0; i < n; i++) { // Parse through the array. Every number that is found is changed to true in boolean array. .

                if (A[i] > 0 && A[i] <= n)
                    present[A[i]] = true;  // The value that the array is holding in that location is the position value is set to true.

                maxele = Math.max(maxele, A[i]); // Put the highest value you have found sofar in maxele int. This is to be able to return in case all numbers before are here.
            }


            for (int i = 1; i < N; i++) // After putting all the numbers in the boolean array. Search for the first FALSE and return it.
                if (!present[i])
                    return i;

            return maxele + 1; // Else return the highest element you found +1
        }

    }

