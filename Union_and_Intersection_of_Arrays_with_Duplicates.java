import java.util.*;

class Solution {
    public static int findUnion(int a[], int b[]) {
        // code here
        Set<Integer> set = new HashSet<>();
        // no duplicates allowed , so the duplicates problem is solved
        for (int i = 0; i < a.length; i++) {
            set.add(a[i]);
        }
        for (int i = 0; i < b.length; i++) {
            set.add(b[i]);
        }

        // but the problem is speed here
        return set.size();
    }

    static ArrayList<Integer> intersection(int[] a, int[] b) {
        ArrayList<Integer> res = new ArrayList<>();

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < b.length; j++) {
                if (a[i] == b[j]) {
                    res.add(a[i]);
                    break;
                }
            }
        }

        return res;
    }

}