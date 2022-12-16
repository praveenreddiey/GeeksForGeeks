package org.geeksforgeeks.easy.recursion;

public class Nto1Digits {
    public static void printNTo1(int n){
        if(n==0)
            return;
        printNTo1(n-1);
        System.out.print(n+" ");
    }
}
