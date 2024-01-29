package HashImplementation;

import java.util.HashSet;

public class RemoveDuplicates {
    public static String removeDuplicatesHashSet(String input)
    {
        HashSet<Character> charSet = new HashSet<>();
        char[] charArray = input.toCharArray();
        for(char c : charArray) {
            charSet.add(c);
        }
        StringBuilder result = new StringBuilder();
        for (Character c : charSet) {
            result.append(c);
        }
        return result.toString();
    }

}
