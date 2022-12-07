package org.geeksforgeeks.easy.arrays;

public class LargestElement {
    public static int largestElement(int[] arr, int n){

        //time complexity = theta(n)

        int result = 0;
        for(int i=1;i<n;i++){
            if(arr[i] > arr[result]){
                result = i;
            }
        }
        return result;
    }
}
