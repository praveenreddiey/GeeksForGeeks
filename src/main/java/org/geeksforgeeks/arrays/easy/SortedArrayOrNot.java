package org.geeksforgeeks.arrays.easy;

public class SortedArrayOrNot {
    public static boolean sortedArrayOrNot(int[] arr, int n) {

        //time complexity = O(n)

        for(int i=1;i<n;i++){
            if(arr[i] < arr[i-1]){
                return false;
            }
        }
        return true;
    }
}
