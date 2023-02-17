package org.geeksforgeeks.easy.binarysearch;

public class FindElement {
    public static void main(String[] args) {
        // System.out.println(findIndex(new int[]{5,10,15,25,35},20));
        System.out.println(BinarySearchUsingRecursion(new int[]{5,10,15,25,35},0,4,100));
    }

    public static int findIndex(int[] nums, int number){
        int start = 0;
        int end = nums.length-1;
        while(nums[start] <= nums[end]){
            int mid = (start+end)/2;
            if(nums[mid] > number ){
                end = mid-1;
            }
            else if(nums[mid] < number){
                start = mid+1;
            }
            else{
                return mid;
            }
        }
        return -1;
    }
    public static int BinarySearchUsingRecursion(int[] nums,int start, int end, int number){
        if(start > end){
            return -1;
        }
        int mid = (start+end)/2;
        if(nums[mid] > number ){
           return BinarySearchUsingRecursion(nums,start,mid-1,number);
        }
        else if(nums[mid] < number){
            return BinarySearchUsingRecursion(nums,mid+1,end,number);
        }else{
            return mid;
        }

    }
}
