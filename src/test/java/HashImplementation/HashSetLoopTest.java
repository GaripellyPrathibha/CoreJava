package HashImplementation;

import org.junit.Test;

import java.util.HashSet;

import static HashImplementation.HashSetLoop.*;

public class HashSetLoopTest {
    @Test
    public void testEmptyHashSet() {
        HashSet<String> set = new HashSet<>();
        iterateUsingIterator(set);
        forLoop(set);
        enhancedForLoop(set);
    }

    @Test
    public void testHashSetOneElement() {
        HashSet<String> set = new HashSet<>();
        set.add("Apple");
        iterateUsingIterator(set);
        forLoop(set);
        enhancedForLoop(set);

    }
}
