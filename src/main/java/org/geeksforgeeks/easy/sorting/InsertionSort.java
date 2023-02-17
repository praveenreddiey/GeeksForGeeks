package org.geeksforgeeks.easy.sorting;

import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        //20,5,40,60,10,30
        System.out.println(Arrays.toString(insertionSort(new int[]{20,5,40,60,10,30})));
    }

    public static int[] insertionSort(int[] arr) {
        for(int i=1;i<arr.length;i++){
            int key = arr[i];
            int j = i-1;

            // Compare key with each element on the left of it until an element smaller than
            // it is found.
            // For descending order, change key<array[j] to key>array[j].

            while(j>=0 && key < arr[j]){
                arr[j+1] = arr[j];
                --j;
            }

            // Place key at after the element just smaller than it.

            arr[j+1] = key;
        }
        return arr;
    }

}
