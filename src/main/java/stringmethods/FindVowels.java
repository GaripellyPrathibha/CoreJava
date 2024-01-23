package stringmethods;

import java.util.Scanner;

public class FindVowels {
    public static int countVowels(String input) {
        input = input.toLowerCase();

        int length = input.length();
        int count = 0;

        for (int i = 0; i < length; i++) {
            char alpha = input.charAt(i);
            if (alpha == 'a' || alpha == 'e' || alpha == 'i' || alpha == 'o' || alpha == 'u') {
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a string:");
        String str = sc.nextLine();

        int result = countVowels(str);

        System.out.println("The number of vowels are " + result);

    }
}


