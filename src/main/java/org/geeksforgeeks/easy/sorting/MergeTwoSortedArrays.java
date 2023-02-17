package org.geeksforgeeks.easy.sorting;

import java.beans.PropertyEditorSupport;
import java.util.Arrays;

public class MergeTwoSortedArrays {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(merge2SortedArrays(new int[]{10,15,20}, new int[]{5,6,6,15})));
    }
    public static int[] merge2SortedArrays(int[] arr1, int[] arr2){
        int[] resArray = new int[arr1.length + arr2.length];
        int current = arr1.length + arr2.length -1;
        int p1 = arr1.length-1;
        int p2 = arr2.length-1;
        while(p1 >= 0 && p2 >= 0){
            if(arr1[p1] >= arr2[p2]){
                resArray[current--] = arr1[p1--];
            }else{
                resArray[current--] = arr2[p2--];
            }
        }
        while(p2>=0){
            resArray[current--] = arr2[p2--];
        }
        while(p1>=0){
            resArray[current--] = arr1[p1--];
        }
        return resArray;

    }
}
