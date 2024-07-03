import java.util.HashMap;
import java.util.Scanner;

public class HashMapDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String sentence = sc.nextLine();
        sc.close();
        // Split the sentence into words
        String[] words = sentence.split(" ");

        // Create a HashMap to store the frequency of each word
        HashMap<String, Integer> wordCountMap = new HashMap<>();

        // Count the frequency of each word
        for (String word : words) {
            word = word.toLowerCase(); // Convert to lowercase to make it case-insensitive
            if (wordCountMap.containsKey(word)) {
                wordCountMap.put(word, wordCountMap.get(word) + 1);
            } else {
                wordCountMap.put(word, 1);
            }
        }

        // Find the most repeated word
        String mostRepeatedWord = null;
        int maxCount = 0;
        for (String word : wordCountMap.keySet()) {
            int count = wordCountMap.get(word);
            if (count > maxCount) {
                mostRepeatedWord = word;
                maxCount = count;
            }
        }

        // Print the most repeated word
        if (mostRepeatedWord != null) {
            System.out.println("The most repeated word is: " + mostRepeatedWord);
            System.out.println("It appears " + maxCount + " times.");
        } else {
            System.out.println("No words found.");
        }
    }
}
