package org.geeksforgeeks.easy.recursion;

public class Fibbannocci {
    public static int fibbannocci(int n){
        if(n==0)
            return 0;
        if(n==1)
            return 1;
        return fibbannocci(n-1)+fibbannocci(n-2);
    }
}
