import java.util.*;

class Solution {
    public int longestConsecutive(int[] nums) {
        Arrays.sort(nums);
        if(nums.length == 0) return 0;
        int count = 1;
        //if we take Intefer.MIN_VALUE as the first element, it will not work
        //because the first element will not be equal to the previous element
        int max = 1;
        for(int i = 1;  i< nums.length ; i++){
            if(nums[i] == nums[i - 1]) continue;
            if(nums[i] == nums[i - 1] + 1){
                count++;
            }else{
                count = 1;
        }
            max = Math.max(max,count);
    }
        return max;
    }
}