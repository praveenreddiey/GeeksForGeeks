package org.geeksforgeeks.easy.recursion;

public class Fibbannocci {
    public static void main(String[] args) {
        int maxNumber = 10;
        System.out.print("Fibonacci Series of "+maxNumber+" numbers: ");
        for(int i = 0; i < 10; i++){
            System.out.print(fibbannocci(i) +" ");
        }
    }

    public static int fibbannocci(int n){
        if(n==0)
            return 1;
        if(n==1)
            return 1;
         return fibbannocci(n-1)+fibbannocci(n-2);


    }
}
