package org.geeksforgeeks.easy.arrays;

import java.util.Arrays;

public class InsertAndUpdateArrays {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(insert(new int[]{5,7,10,20,0},3,2,4)));
        System.out.println(delete(new int[]{3,8,12,5,6},5,12));
    }
    public static int[] insert(int[] arr,int x, int position,int cap){
        if(arr.length==cap)
            return arr;
        int index = position-1;
        int i=0;
        for(i=arr.length-1;i>index;i--){
            arr[i]=arr[i-1];
        }
        arr[i]=x;
        return arr;
    }
    public static int delete(int[] arr,int n,int x){
        int i;
        for(i=0;i<n;i++){
            if(arr[i]==x)
                break;
        }
        if(i==n)
            return n;
        for(int j=i;j<n-1;j++){
            arr[j]=arr[j+1];
        }
        return n-1;

    }
}
