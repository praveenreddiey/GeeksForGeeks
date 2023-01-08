package org.geeksforgeeks.easy.hashing;

import java.util.HashMap;
import java.util.Map;

public class subArrayWIthZeroSum {

    public boolean subArrayWithSumZero(int[] arr){
        Map<Integer,Integer> map = new HashMap<>();
        int preSum = 0;
        for(int i=0;i< arr.length;i++){
            preSum += arr[i];
            if(!map.containsKey(preSum))
                map.put(preSum,i);
            else{
                return true;
            }
        }
        return false;
    }
}
