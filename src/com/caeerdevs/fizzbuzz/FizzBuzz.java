package com.caeerdevs.fizzbuzz;

public class FizzBuzz {

    public static void fizzBuzz() {

        for (int num = 1; num <= 15; num++) {
            if (num % 3 != 0 && num % 5 != 0)
                System.out.println(num);
            else if (num % 3 == 0 && num % 5 != 0)
                System.out.println("Fizz");
            else if (num % 3 != 0 && num % 5 == 0)
                System.out.println("Buzz");
            else if (num % 3 == 0 && num % 5 == 0)
                System.out.println("FizzBuzz");
        }
    }
}
