package stringmethods;

import java.util.Arrays;
import java.util.Scanner;

public class Anagram {
    public static boolean areAnagrams(String str1, String str2) {
        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();

        if (str1.length() != str2.length()) {
            return false;
        }

        char[] charArr1 = str1.toCharArray();
        char[] charArr2 = str2.toCharArray();

        Arrays.sort(charArr1);
        Arrays.sort(charArr2);

        return Arrays.equals(charArr1, charArr2);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the first string:");
        String str1 = sc.nextLine();

        System.out.println("Enter the second string:");
        String str2 = sc.nextLine();

        boolean result = areAnagrams(str1, str2);

        if (result) {
            System.out.println("Yes, they are anagrams.");
        } else {
            System.out.println("No, they are not anagrams.");
        }
    }
}

