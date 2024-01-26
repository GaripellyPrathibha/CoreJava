package hashmapImplementation;

import org.junit.Test;

import java.util.HashMap;

public class DistinctHashMapTest {
    @Test
    public void testSingleCharacter() {
        DistinctHashMap.printCharacterCounts("a");

    }

    @Test
    public void testRepeatedCharacters() {
        DistinctHashMap.printCharacterCounts("Prathibha");

    }

}
