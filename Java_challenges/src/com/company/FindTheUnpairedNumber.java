package com.company;

public class FindTheUnpairedNumber {

    public FindTheUnpairedNumber() {
        int[] A = {9, 3, 9, 3, 9, 9, 7};

        System.out.println(solution(A));
    }

    private int solution(int[] A) {

        int xor = 0;
        for (int i : A) {
            xor = xor ^ i;  //XOR is a Grind that returns TRUE if only one of the inputs is 1.
        }
        return xor; // We know that if we XOR a number with itself an odd number of times, the result is the number itself;
        // otherwise, if we XOR a number an even number of times with itself, the result is 0. Also, the XOR of a number with 0 is always the number itself.
    }
}
