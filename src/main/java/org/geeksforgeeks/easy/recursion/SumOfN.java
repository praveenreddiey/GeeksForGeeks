package org.geeksforgeeks.easy.recursion;

public class SumOfN {
    public static int sumOfNNumbers(int n){
        if(n == 0)
            return 0;
        return n+ sumOfNNumbers(n-1);
    }
}
