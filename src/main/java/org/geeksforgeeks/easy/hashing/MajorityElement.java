package org.geeksforgeeks.easy.hashing;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class MajorityElement {
    public static void main(String[] args) {
        System.out.println(majorityElement(new int[]{5},1));
    }
    static int majorityElement(int a[], int size)
    {
        Map<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<a.length;i++){
            if(map.containsKey(a[i])){
                map.put(a[i],map.get(a[i])+1);
            }
            else{
                map.put(a[i],1);
            }
        }
        for(int key : map.keySet()){
            if(map.get(key) > size/2)
                return key;
        }
        return -1;
    }
}
