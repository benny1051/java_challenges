package com.company;

public class jumpFromXtoY {

    public jumpFromXtoY(){
        int X=10;
        int Y=85;
        int D=30;

        System.out.println(solution(X,Y,D));
    }

    public int solution(int X, int Y, int D) {
        if ((Y - X) % D == 0) {  // If the (endpoint minus the startpoint) modulus 30 is 0. Then that means that you jump exactly modulus times.
            return (Y - X) / D;  // the total length divided by jumpingdistande. (in this case 3)
        }
        return (Y - X) / D + 1;       //Otherwise you jump modulus times +1 time to get beyond finish.
        // the total length divided by jumpingdistande. (in this case 3)
    }
}
