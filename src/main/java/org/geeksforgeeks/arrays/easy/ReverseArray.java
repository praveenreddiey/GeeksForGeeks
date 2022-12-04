package org.geeksforgeeks.arrays.easy;

import org.w3c.dom.ls.LSOutput;

import java.util.Arrays;

public class ReverseArray {
    //10,5,7 30,1
    public static void reverseArray(int[] arr, int n){
        //time complexity = theta(n)

        //using for loop
//        int high = n-1;
//        for(int low=0;low<n/2;low++) {
//            int temp = arr[low];
//            arr[low] = arr[high];
//            arr[high] = temp;
//            high--;
//        }

        //using while loop
        int high =n-1;
        int low =0;
        while(high > low){
            int temp = arr[low];
            arr[low] = arr[high];
            arr[high] = temp;
            low++;
            high--;
        }
        System.out.println(Arrays.toString(arr));
    }

}
