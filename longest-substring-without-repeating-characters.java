import java.util.*;

class Solution {
    public int lengthOfLongestSubstring(String s) {
        Set<Character> set = new HashSet<>();
        int start = 0;
        int max = 0;
        for(int i = 0 ; i < s.length() ; i++){
            while(set.contains(s.charAt(i)) ){
              set.remove(s.charAt(start));
              start++;  
            }
            set.add(s.charAt(i));
            max = Math.max(max , i - start + 1);
        }
        return max;
    }
}