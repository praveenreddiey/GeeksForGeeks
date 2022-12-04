package org.geeksforgeeks.arrays.easy;

public class MoveZeroesToEnd {
    //[8,5,0,10,0,20]
    public static void moveZeroesToEnd(int[] nums, int n){
        int count =0;
        for(int i=0;i<n;i++){
            if(nums[i]!=0){
                LeftRotateArrayByDPlaces.swap(nums,i,count++);
            }
        }

    }
}
