package org.geeksforgeeks.easy.arrays;

public class SecondLargestElement {

    //naive approach
    public static int SecondLargestElementNaive(int[] arr, int n) {

        //time complexity = O(n)

        int largest = findLargest(arr, n);
        int secLargestNumber = 0;
        int index=-1;
        for (int i = 0; i < n; i++) {
            if (arr[i] == largest) {
                continue;
            }
            if (arr[i] > secLargestNumber) {
                secLargestNumber = arr[i];
                index=i;
            }
        }
        return index;
    }
    public static int findLargest(int[] arr, int n){
        int largest = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            if (arr[i] > largest) {
                largest = arr[i];
            }
        }
        return largest;
    }

    //efficient approach
    public static int secondLargestElement(int[] arr, int n){

        //time complexity = theta(n)

        int largest = 0;
        int result = -1;
        for(int i = 1; i < n;i++){
            if(arr[i] > arr[largest]){
                result = largest;
                largest = i;
            }
            else if(arr[i] != arr[largest]){
                if(result == -1 || arr[i] > arr[result]){
                    result = i;
                }
            }
        }
        return result;
    }

}

