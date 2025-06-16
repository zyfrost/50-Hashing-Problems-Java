public class CharacterFrequencyArray {
    public static void main(String[] args) {
        String str = "programming";
        int[] freq = new int[26]; // 26 letters in the alphabet

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch >= 'a' && ch <= 'z') { // Only lowercase
                freq[ch - 'a']++;
            }
        }

        // Print frequencies
        for (int i = 0; i < 26; i++) {
            if (freq[i] > 0) {
                System.out.println((char)(i + 'a') + " -> " + freq[i]);
            }
        }
    }
}




// Move this class to a separate file named CharacterFrequency.java

// import java.util.HashMap;

// public class CharacterFrequency {
//     public static void main(String[] args) {
//         String str = "programming";

//         HashMap<Character, Integer> freqMap = new HashMap<>();

//         for (char ch : str.toCharArray()) {
//             freqMap.put(ch, freqMap.getOrDefault(ch, 0) + 1);
//         }

//         // Print frequencies
//         for (char ch : freqMap.keySet()) {
//             System.out.println(ch + " -> " + freqMap.get(ch));
//         }
//     }
// }
