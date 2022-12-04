package org.geeksforgeeks.arrays.easy;

public class findImmediateSmallerThanX {
    static int element =-1;
    static int lowMin = Integer.MAX_VALUE;
    public static int immediateSmaller(int arr[], int n, int x) {
        for(int i=0;i<n;i++){
            if(arr[i]<x){
                if(Math.min(lowMin,(x-arr[i])) != lowMin){
                    element = arr[i];
                }
            }
        }
        return element;
    }
}
