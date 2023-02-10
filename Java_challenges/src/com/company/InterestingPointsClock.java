package com.company;

import java.util.Arrays;


public class InterestingPointsClock {

    public InterestingPointsClock() {
        String S = "15:10:00";
        String T = "18:18:40";
        System.out.println("Interesting points:  "+solution(S, T));
    }

    public int solution(String S, String T){

        String[] startArrOfStr = S.split(":", 3);
        int startHours= Integer.parseInt(startArrOfStr[0]);
        int startMin= Integer.parseInt(startArrOfStr[1]);
        int startSec= Integer.parseInt(startArrOfStr[2]);

        String[] stopArrOfStr = T.split(":", 3);
        int stopHours= Integer.parseInt(stopArrOfStr[0]);
        int stopMin= Integer.parseInt(stopArrOfStr[1]);
        int stopSec= Integer.parseInt(stopArrOfStr[2]);

        Boolean[] array = new Boolean[10];
        int interestingPoints = 0;
        int counter=0;
     while (startHours <stopHours || startMin<stopMin || startSec <= stopSec) {

         if (startSec<10){
             S= (startHours+":"+startMin+ ":"+ "0"+ startSec);
         }
         else if (startMin<10) {
             S = (startHours + ":" + "0" + startMin + ":" +  startSec);
         }
         else if (startHours<10) {
             S = ("0" + startHours + ":" + startMin + ":" + startSec);
         }
         else {
             S= (startHours+":"+startMin+ ":"+ startSec);
         }

         System.out.println(S +" after concatenating string");

         Arrays.fill(array, false);
         counter=0;


         for (int i = 0; i < S.length()+2; i++) {
             if (S.contains(String.valueOf(i))){
                 array[i]=true;
             }
         }

         for (Boolean aBoolean : array) {
             if (aBoolean) {
                 counter++;
             }
         }
         if (counter <= 2) {
             interestingPoints++;
         }
         System.out.println(" counter "+ counter);
         startSec++;
         if (startSec==60){
             startSec=0;
             startMin++;
             if (startMin==60){
                 startMin=0;
                 startHours++;
                 if (startHours==24){
                     break;
                 }
             }
         }
     }


        return interestingPoints;
    }
}
