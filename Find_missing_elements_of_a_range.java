// A hashing based Java program to find missing
// elements from an array

import java.util.*;

class Ideone {
    // Print all elements of range [low, high] that
    // are not present in arr[0..n-1]
    static void printMissing(int ar[], int low, int high)
    {
        HashSet<Integer> hs = new HashSet<>();

        // Insert all elements of arr[] in set
        for (int i = 0; i < ar.length; i++)
            hs.add(ar[i]);

        // Traverse through the range an print all
        // missing elements
        for (int i = low; i <= high; i++) {
            if (!hs.contains(i)) {
                System.out.print(i + " ");
            }
            
        }
    }

    // Driver program to test above function
    public static void main(String[] args)
    {
        int arr[] = { 1, 3, 5, 4 };
        int low = 1, high = 10;
        printMissing(arr, low, high);
    }
    
    // Membership Checking
    static void findMissing(int[] arr, int n, int low,
                            int high)
    {
        // Loop through the range of numbers from low to
        // high
        for (int i = low; i <= high; i++) {
            boolean found = false;
            // Loop through the array to check if i exists
            // in it
            for (int j = 0; j < n; j++) {
                if (arr[j] == i) {
                    found = true;
                    break;
                }
            }

            // If i is not found in the array, print it
            if (!found) {
                System.out.print(i + " ");
            }
        }
    }
}


