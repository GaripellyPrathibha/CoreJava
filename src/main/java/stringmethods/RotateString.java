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


}

