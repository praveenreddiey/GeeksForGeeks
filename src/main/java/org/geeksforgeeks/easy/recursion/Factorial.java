package org.geeksforgeeks.easy.recursion;

public class Factorial {
    public static int factorial(int n){
        if(n==0 || n==1)
            return 1;
        return n*factorial(n-1);
    }
}
