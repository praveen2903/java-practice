import java.util.Scanner;

public class SplitWords {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String sentence = sc.nextLine();
        sc.close();
        // Split the sentence into words based on spaces
        String[] words = sentence.split(" ");

        // Print each word
        for (String word : words) {
            System.out.println(word);
        }
    }
}
