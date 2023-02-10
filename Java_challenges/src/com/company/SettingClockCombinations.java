package com.company;

public class SettingClockCombinations {
    int count;
        public void getPermutations(int A, int B, int C, int D){
            int array[]=new int[4];
            array[0]=A;
            array[1]=B;
            array[2]=C;
            array[3]=D;
            helper(array, 0);
            count=count/4; // Divide it by four since we count every time in the loop. 4 cause we have 4 letters.
            System.out.println("count" +count);
        }

        private void helper(int[] array, int pos){ //Position is 0 but increases by 1 every callback.
            int A = array[0];
            int B = array[1];
            int C = array[2];
            int D = array[3];
            if(pos >= array.length - 1){ //if position is at the end of the array.
                for(int i = 0; i < array.length; i++){
                    if (A >= 0 && A <= 2 && B >= 0 && B <= 9 && C >= 0 && C <= 5 && D >= 0 && D <= 9) {
                        System.out.print(array[i] + ", ");
                        count++;
                    }
                }
                System.out.println();
                return;
            }

            for(int i = pos; i < array.length; i++){ // A loop where the method swaps places with the bumbers and calls itself one time for every position in the array.

                int t = array[pos];        //Swapping the value at position with the current index in the loop
                array[pos] = array[i];
                array[i] = t;

                helper(array, pos+1);

                t = array[pos];             //Swapping the value at position with the current index in the loop
                array[pos] = array[i];
                array[i] = t;
            }
        }
    }

