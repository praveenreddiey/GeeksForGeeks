package org.geeksforgeeks.easy.recursion;

public class RopeCutting {
    public static int ropeCutting(int n,int a,int b,int c){
        if(n<0)
            return -1;
        if(n==0)
            return 0;
        int res = Math.max(ropeCutting(n-a, a, b, c),Math.max(ropeCutting(n-b, a, b, c), ropeCutting(n-c, a, b, c)));
        return res+1;




    }
}
