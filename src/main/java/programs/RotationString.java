package programs;

public class RotationString {
    public static boolean isRotatedString(String str1, String str2) {
        if(str1==null ||str2==null){
            return false;
        }
        if (str1.length() != str2.length()) {
            return false;
        }
        String concatenatedString = str1 + str1;
        return concatenatedString.contains(str2);
    }
}
