package org.geeksforgeeks.easy.recursion;

public class SumOfDigits {
    public static int sumOfDigits(int number){
        if(number == 0)
            return 0;
        return number%10 + sumOfDigits(number/10);
    }
}
