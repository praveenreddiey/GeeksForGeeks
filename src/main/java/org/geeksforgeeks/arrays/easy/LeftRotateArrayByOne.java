package org.geeksforgeeks.arrays.easy;

import java.util.Arrays;

public class LeftRotateArrayByOne {
    public static void leftRotateArrayByOne(int[] nums,int n,int places){
        int num = nums[0];
        for(int i= places; i<n; i++){
            nums[i-1] = nums[i];
        }
        nums[n-places] = num;
        System.out.println(Arrays.toString(nums));


    }
}
