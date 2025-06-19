
class Solution {
    public int longestSubarray(int[] arr, int k) {
        // code here
        int start = 0; 
        int max = 0;
        int n = arr.length;
        int sum  = 0;
        
        for(int i = 0 ; i < n ; i++){
            sum += arr[i];
            
            while(sum > k && start <= i){
                sum -= arr[start];
                start++;
                
            }
            
            if(sum == k ){
                max = Math.max(max ,i - start + 1);
            }
        }
        return max;
    }
}
