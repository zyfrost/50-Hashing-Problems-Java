import java.util.ArrayList;

class Solution {
    static ArrayList<Integer> subarraySum(int[] arr, int target) {
       int n = arr.length;
       int start = 0 ;
       int sum = 0;
       ArrayList<Integer> list = new ArrayList<>();
       for(int i = 0; i < n ; i++){
           sum += arr[i];
           
           while(sum > target && start < i){
               //remove the sum of the start index
               sum -= arr[start];
               // goto next start index
               start++;
           }
           
           if(sum == target){
               list.add(start + 1);
               list.add(i + 1);
               return list;
           }
           
       }
       list.add(-1);
       return list;
    }
}
// Time Complexity: O(n)
// Space Complexity: O(1) for the sum and start variables