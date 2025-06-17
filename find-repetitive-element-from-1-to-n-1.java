// User function Template for Java

import java.util.*;

class Solution {
    public int findDuplicate(int[] arr) {
        // code here
        Map<Integer,Integer> map = new HashMap<>();
        for(int num : arr){
            map.put(num , map.getOrDefault(num , 0)+ 1);
        }
        for(int num : arr){
            if(map.get(num) > 1){
                return num;
            }
        }
        return '$';
    }
}