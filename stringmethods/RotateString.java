package stringmethods;

import java.util.Scanner;

public class RotateString {
    public static void main(String[] args) {
        String str1 = new String();
        String str2 = new String();
        Scanner sc = new Scanner(System.in);
        str1 = sc.nextLine();
        str2 = sc.nextLine();
        boolean result = false;
        if (str1.length() == str2.length()) {
            String str3 = str1 + str1;
            result = str3.contains(str2);

        }
        if (result) {
            System.out.println("yes ");
        } else {
            System.out.println("No ");
        }
    }
}
