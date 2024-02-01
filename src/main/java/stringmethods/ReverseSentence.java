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


}



