package org.geeksforgeeks.easy.hashing;

import java.util.HashMap;
import java.util.Map;

public class LongestSubArrayWithGivenSum {
    public static void main(String[] args) {
        longestSubArrayWithSum(new int[]{8,3,1,5,-6,6,2,2}, 4, 8);
    }

    //5,8,-4,-4,9,-2,-2
    public static void longestSubArrayWithSumNaive(int[] arr, int sum) {
        int length = 0;
        for (int i = 0; i < arr.length; i++) {
            int currentSum = 0;
            for (int j = i; j < arr.length; j++) {
                currentSum += arr[j];
                int currentLength = j - i + 1;
                if (currentSum == sum) {
                    if (currentLength > length) {
                        length = currentLength;
                    }
                }
            }
        }
        System.out.println(length);
    }

    //3,1,0,1,8,2,3,6
    public static void longestSubArrayWithSum(int[] arr, int k, int n) {
        int maxLength =0 ; int sum = 0;
        Map<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
            if(sum == k){
//                map.put(sum,i+1);
                maxLength = i+1;
            }
            if(!map.containsKey(sum)){
                map.put(sum,i);
            }
            if(map.containsKey(sum-k)){
                if(maxLength < (i -(map.get(sum-k)))){
                    maxLength = i -(map.get(sum-k));
                }
            }
        }
        System.out.println();
    }
}
