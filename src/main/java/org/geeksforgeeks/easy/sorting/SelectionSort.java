package org.geeksforgeeks.easy.sorting;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        //time complexity= theta(n2)
        System.out.println(Arrays.toString(selectionSort(new int[]{2,10,8,7})));
    }
    public static int[] selectionSort(int[] arr) {
//10,5,8,20,2,18
        for(int i=0;i<arr.length;i++){
            int minIndex = i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            swap(arr,i,minIndex);
        }
        return arr;
    }
    public static void swap(int[] arr, int first, int sec){
        int temp = arr[first];
        arr[first] = arr[sec];
        arr[sec] = temp;
    }
}
