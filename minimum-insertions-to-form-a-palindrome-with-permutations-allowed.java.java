class MinimumInsertionsToFormPalindrome {

    static int minInsertion(String str)
    {
        int n = str.length();

        int res = 0;

        int[] count = new int[26];

        for (int i = 0; i < n; i++)
            count[str.charAt(i) - 'a']++;

        for (int i = 0; i < 26; i++) {
            if (count[i] % 2 == 1)
                res++;
        }

        return (res == 0) ? 0 : res - 1;
    }

    // Driver program
    public static void main(String[] args)
    {
        String str = "geeksforgeeks";
        System.out.println(minInsertion(str));
    }
}