import java.util.*;

class Solution {
    boolean twoSum(int arr[], int target) {
        // code here
        Map<Integer , Integer > map = new HashMap<>();
        for(int i = 0 ;i <arr.length ;i++){
            int complement = target -arr[i];
            if(map.containsKey(complement)){
                return true;
            }
            // if not found , add the current element to the map
            map.put(arr[i],i);
        }
        return false;
    }
}