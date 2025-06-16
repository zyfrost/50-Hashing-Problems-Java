/*You are required to complete this method */

import java.util.*;

class GfG {
    public static int countDistinctSubstring(String st) {
        // your code here
        Set<String> set = new HashSet<>();
        for(int i = 0 ; i < st.length(); i++){
            StringBuilder sb = new StringBuilder();
            for(int j = i ;  j < st.length() ; j++){
                sb.append(st.charAt(j));
                set.add(sb.toString());
            }
        }
        return set.size() + 1;
    }
}