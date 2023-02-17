package org.geeksforgeeks.easy.sorting;

import java.util.Arrays;

public class BubbleSort {
    //stable sorting algorithm
    public static void main(String[] args) {
        //time complexity = theta(n2)
        System.out.println(Arrays.toString(bubbleSort(new int[]{2,10,8,7})));
    }
    public static int[] bubbleSort(int[] arr){
        //if array is sorted or partially sorted
        boolean swapped;
        //2,10,8,7
        for(int i=0;i<arr.length-1;i++){
            swapped = false;
            for(int j=i;j<arr.length-i-1;j++){
                if(arr[j] > arr[j+1]){
                    swap(arr,j,j+1);
                    swapped = true;
                }
            }
            if(swapped == false){
                break;
            }
        }
        return arr;
    }
    public static void swap(int[] arr, int first, int sec){
        int temp = arr[first];
        arr[first] = arr[sec];
        arr[sec] = temp;
    }
}
