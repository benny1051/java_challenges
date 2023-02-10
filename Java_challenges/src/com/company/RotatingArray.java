package com.company;

public class RotatingArray {

    public RotatingArray(){
        int[] A = new int[]{3,8,9,7,6};
        int K=2;
solution(A,K);
        for (int i = 0; i < A.length; i++) {
            System.out.print(A[i]+",");
        }
    }
    public int[] solution(int[] A, int K) {
        System.out.println("Original array: ");
        for (int i = 0; i < A.length; i++) {
            System.out.print(A[i] + " ");
        }
        System.out.println();

        //Rotate the given array by n times toward left
        for(int i = 0; i < K; i++){
            int j, first;
            //Stores the first element of the array
            first = A[0];

            for(j = 0; j < A.length-1; j++){
                //Shift element of array by one
                A[j] = A[j+1];
            }
            //First element of array will be added to the end
            A[j] = first;
        }


        return A;
    }

}
