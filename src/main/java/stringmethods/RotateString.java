package stringmethods;
import java.util.Scanner;
public class RotateString {
    public static boolean isRotatedString(String str1, String str2) {
        if (str1.length() != str2.length()) {
            return false;
        }
        String concatenatedString = str1 + str1;
        return concatenatedString.contains(str2);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the first string:");
        String str1 = sc.nextLine();

        System.out.println("Enter the second string:");
        String str2 = sc.nextLine();

        boolean result = isRotatedString(str1, str2);

        if (result) {
            System.out.println("Yes, the second string is a rotation of the first string.");
        } else {
            System.out.println("No, the second string is not a rotation of the first string.");
        }
    }
}

