package org.geeksforgeeks.easy.arrays;

public class LeftRotateArrayByDPlaces {
    public static int[] leftRotateArrayByDPlaces(int[] nums, int n, int places) {

        //time complexity = theta(places + n - places + n) -> theta(2n) -> theta(n)
        //auxilary space = theta(1)

        reverse(nums, 0, places - 1);
        reverse(nums, places, n - 1);
        reverse(nums, 0, n - 1);
        return nums;
    }
    public static void reverse(int[] nums, int start, int end){
        while(start< end){
            swap(nums,start,end);
            start++;
            end--;
        }
    }
    public static void swap(int[] nums, int start, int end){
        int temp = nums[start];
        nums[start] = nums[end];
        nums[end] = temp;
    }
}

