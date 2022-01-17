package com.caeerdevs.last_and_second_last;

import java.util.Scanner;

public class LastAndSecondLast {

     public static void lastAndSecondLast(){

         Scanner scanner=new Scanner(System.in);
         System.out.print("Input a word: ");
         String  input=scanner.nextLine();
       //  String input="apple";
         char[] wordArr=input.toCharArray();
         int wordLength=wordArr.length;
         char lastLetter=wordArr[wordLength-1];
         char secondLast=wordArr[wordLength-2];
         String output=lastLetter+" "+secondLast;

         System.out.printf("%s",output);

     }
}
