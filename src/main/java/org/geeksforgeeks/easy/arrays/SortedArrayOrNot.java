package org.geeksforgeeks.easy.arrays;

public class SortedArrayOrNot {
    public static boolean sortedArrayOrNot(int[] arr, int n) {

        //time complexity = O(n)

        boolean asc = false;
        boolean desc = false;
        asc = ascending(arr, n);
        desc= descending(arr,n);
        return asc == true ? asc : desc;
    }
    public static boolean ascending( int[] arr, int n){
        for (int i = 1; i < n; i++) {
            if (arr[i] < arr[i - 1]) {
                return false;
            }
        }
        return true;
    }
    public static boolean descending( int[] arr, int n){
        for (int i = n - 1; i > 0; i--) {
            if (arr[i] > arr[i - 1]) {
                return false;
            }
        }
        return true;
    }
}
