package org.geeksforgeeks.easy.hashing;

import java.util.HashSet;
import java.util.Set;

public class SubArrayWithGivenSum {
    //5,8,6,1,3,3,-1
    public static void main(String[] args) {
        System.out.println(SubArrayWithGivenSum.subArrayWithGivenSum(new int[]{3,2,5,6},10));
    }
    public static boolean subArrayWithGivenSum(int[] arr, int sum){
        Set<Integer> set = new HashSet<>();
        int prefixSum1 = 0;
        int prefixSum2 = 0;
        for(int i=0;i<arr.length;i++){
            prefixSum1+=arr[i];
            if(prefixSum1==sum)
                return true;
            prefixSum2 = prefixSum1-sum;
            if(set.contains(prefixSum2))
                return true;
            set.add(prefixSum1);
        }
        return false;
    }
}
