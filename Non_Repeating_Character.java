import java.util.*;

class Solution {
    static char nonRepeatingChar(String s) {
        // code here
        Map<Character,Integer> map = new HashMap<>();
        for(char ch : s.toCharArray()){
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        
        for(int i = 0; i < s.length() ; i++){
            char ch = s.charAt(i);
                if(map.get(ch) == 1){
                    return ch;
                }
            }
            return '$';

        }
    }

