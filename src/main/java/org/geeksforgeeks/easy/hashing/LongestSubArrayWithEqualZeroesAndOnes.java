package org.geeksforgeeks.easy.hashing;

import java.util.HashMap;
import java.util.Map;

public class LongestSubArrayWithEqualZeroesAndOnes {
    public static void main(String[] args) {
        System.out.println(LongestSubArrayWithEqualZeroesAndOnes.longestSubArrayWithEqualOsAnd1s(new int[]{1,0,1,1,1,0,0},0));
    }
    public static int longestSubArrayWithEqualOsAnd1s(int[] arr,int k){
        for(int i=0;i<arr.length;i++){
            if(arr[i] == 0){
                arr[i] = -1;
            }
        }
        int maxLength =0 ; int sum = 0;
        Map<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
            if(sum == k){
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
        return maxLength;
    }

}
