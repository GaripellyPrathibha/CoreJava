package hashmapImplementation;

import java.util.HashMap;

public class DistinctHashMap {
    public static void printCharacterCounts(String str) {
        HashMap<Character, Integer> charMap = new HashMap<>();
        for (char c : str.toCharArray()) {
            if (charMap.containsKey(c)) {
                charMap.put(c, charMap.get(c) + 1);
            } else {
                charMap.put(c, 1);
            }
        }
        for (char ch : charMap.keySet()) {
            System.out.printf("%c-%d, ", ch, charMap.get(ch));
        }
    }
}

