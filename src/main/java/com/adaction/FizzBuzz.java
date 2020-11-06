package com.adaction;

public class FizzBuzz {
    public static void calcFizzBuzz(int n){
        String fizz = "fizz";
        String buzz = "buzz";

        for (int i = 1; i <= n; i++){
            boolean isDivisibleBy3 = i % 3 == 0;
            boolean isDivisibleBy5 = i % 5 == 0;
            if (isDivisibleBy3 && isDivisibleBy5){
                System.out.print(fizz + buzz + " ");
            } else if (isDivisibleBy3) {
                System.out.print(fizz + " ");
            } else if (isDivisibleBy5) {
                System.out.print(buzz + " ");
            } else {
                System.out.print(i + " ");
            }
        }
    }
}
