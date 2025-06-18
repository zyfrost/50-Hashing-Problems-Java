import java.util.*;

class Solution {
    static int majorityElement(int arr[]) {
        // code here
        Map<Integer , Integer > map = new HashMap<>();
        int n = arr.length;
        for(int num :arr){
        map.put(num , map.getOrDefault(num,0)+1);
        }
        for(int i = 0 ; i < n ; i++){
            if(map.get(arr[i]) > n / 2 ){
                return arr[i];
            }
        }
        return -1;
    }
}