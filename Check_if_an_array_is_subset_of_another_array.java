import java.util.*;

class Solution {
    public boolean isSubset(int a[], int b[]) {
        Arrays.sort(a);
        Arrays.sort(b);
        int i = 0;
        int j = 0;

        while (i < a.length && j < b.length) {
            if (a[i] == b[j]) {
                i++;
                j++;
            } else if (a[i] < b[j]) {
                i++;
            } else {
                // a[i] > b[j], so b[j] isn't present in a[]
                return false;
            }
        }

        return j == b.length;
    }
}

