package org.geeksforgeeks.easy.recursion;

public class CountOfDigits {
    static int count=0;
    public static void main(String[] args) {
        System.out.println(countDigits(123456));
    }
    public static int countDigits(int n)
    {
        if(n==0)
            return 1;
        return countDigits(n,0);
    }
    public static int countDigits(int n, int count){
        if(n==0)
            return count;
        return countDigits(n/10,count+1);
    }
}
