package org.geeksforgeeks.arrays.easy;

public class RemoveDuplicates {
    //10,20,20,30,30,30,30
    public static void removeDuplicates(int[] arr, int n){
        int result = 1;
        for(int i=1;i<n;i++){
            if(arr[i]!=arr[result-1]){
                arr[result]=arr[i];
                result++;
            }
        }
    }
}
