package org.geeksforgeeks.easy.hashing;

import java.util.HashMap;
import java.util.Map;

public class countDistinctElementsAndFrequncyOfArrayElements {

    public static void main(String[] args) {
        frequencyOfArrayElements(new int[]{10,12,10,15,10,20,12,12});
    }

    public static void frequencyOfArrayElements(int[] arr){
        Map<Integer,Integer> map = new HashMap<>();
        for(int i=0;i< arr.length;i++){
            if(map.containsKey(arr[i])){
                map.put(arr[i],map.get(arr[i])+1);
            }else{
                map.put(arr[i],1);
            }
        }
        System.out.println(map);
    }
    public static void countOfDistinctElements(int[] arr){
        Map<Integer,Integer> map = new HashMap<>();
        for(int i=0;i< arr.length;i++){
            if(!map.containsKey(arr[i])){
                map.put(arr[i],1);
            }
        }
        System.out.println(map.size());
    }
}
