package com.caeerdevs.counting_closed_paths;

import java.util.ArrayList;
import java.util.List;

public class CountingClosedPaths {

    public static void countingClosedPaths(){

        int input=680;

        String[] closedNumbers={"4","6","9","0"};
        int totalSum=0;
        int totalEights=0;

        String numStr=Integer.toString(input);
        String[] numSplit=numStr.split("");
        for(String num : closedNumbers){
            for(String inNum : numSplit){
               if(inNum.equals(num))
                   totalSum++;
            }
        }
        for(String eights : numSplit) {
            if (eights.equals("8"))
                totalEights++;
        }
        int results=(totalEights*2)+totalSum;

        System.out.println("results: "+results);

    }
}
