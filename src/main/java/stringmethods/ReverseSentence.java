package stringmethods;
import java.util.Arrays;
import java.util.Scanner;

public class ReverseSentence {
    public static String reverseSentence(String input) {
        String[] words = input.split(" ");
        StringBuilder reversedSentence = new StringBuilder();

        for (String word : words) {
            StringBuilder reversedWord = new StringBuilder(word).reverse();
            reversedSentence.append(reversedWord).append(" ");
        }

        return reversedSentence.toString().trim();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a sentence:");
        String sentence = sc.nextLine();

        String reversedSentence = reverseSentence(sentence);

        System.out.println("Reversed sentence: " + reversedSentence);
    }
}



