// User function Template for Java

import java.util.*;

class Solution {
    int countPairs(int[] arr, int k) {
        // code here
        int count = 0;
        int n = arr.length;
        Map<Integer, Integer> map = new HashMap<>();
         for (int i = 0; i < n; i++) {
            if(map.containsKey(arr[i]+k)){
                count+= map.get(arr[i]+k);
            }
            if(map.containsKey(arr[i]- k)){
                count+= map.get(arr[i] - k);
            } 
            map.put(arr[i],map.getOrDefault(arr[i],0)+1);
            
        }
        return count ;
    }
}