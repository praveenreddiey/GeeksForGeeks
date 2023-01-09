package org.geeksforgeeks.easy.hashing;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class subArrayWIthZeroSum {

    public boolean subArrayWithSumZero(int[] arr) {
        Set<Integer> set = new HashSet<>();
        int preSum = 0;
        for (int i = 0; i < arr.length; i++) {
            preSum += arr[i];
            if (set.contains(preSum))
                return true;
            if (preSum == 0)
                return true;
            set.add(preSum);
        }
        return false;
    }
}
