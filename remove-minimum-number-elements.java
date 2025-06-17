import java.util.*;

class Solution {
    public int minRemove(int[] arr1, int[] arr2) {
        // code here
        Map<Integer ,Integer> map = new HashMap<>();
       
        for(int num : arr1){
            map.put(num, map.getOrDefault(num,0)+1);
        }
        
        
        int count = 0;
        for(int num : arr2){
            if(map.containsKey(num) && map.get(num) > 0){
                map.put(num , map.get(num) - 1);
                count++;
            }
            
        }
        return count;
        
        
    }

    public int minthRemove(int[] arr1, int[] arr2) {
        // code here
        Map<Integer ,Integer> map = new HashMap<>();
        Map<Integer ,Integer> map1 = new HashMap<>();
        for(int num : arr1){
            map.put(num, map.getOrDefault(num,0)+1);
        }
        
        for(int num : arr2){
            map1.put(num, map1.getOrDefault(num,0)+1);
        }
        int count = 0;
        for(int key : map.keySet()){
            if(map1.containsKey(key)){
                count+=Math.min(map1.get(key),map.get(key));
            }
            
        }
        return count;
        
        
    }
}
