// User function Template for Java

import java.util.*;

class Solution {
    static int distinct(int arr[]) {
        // code here
        Set<Integer> set = new HashSet<>();
        for(int i = 0 ; i< arr.length ;i++){
            set.add(arr[i]);
        }
        return set.size();
        
        
    }
}