package programs;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class RepeatedCharTest {
    @Test
    public void testNullString() {
        List<Character> result = RepeatedChar.printRepeatedChar(null);
        assertEquals(0, result.size());
    }

    @Test
    public void testEmptyString() {
        List<Character> result = RepeatedChar.printRepeatedChar("");
        assertEquals(0, result.size());
    }

    @Test
    public void testSingleCharString() {
        List<Character> result = RepeatedChar.printRepeatedChar("a");
        assertEquals(0, result.size());
    }

    @Test
    public void testRepeatedCharString() {
        List<Character> expected = new ArrayList<>();
        expected.add('l');
        List<Character> result = RepeatedChar.printRepeatedChar("hello");
        assertEquals(expected, result);
    }

    @Test
    public void testMultipleRepeatedChars() {
        List<Character> expected = new ArrayList<>();
        expected.add('a');
        expected.add('n');
        List<Character> result = RepeatedChar.printRepeatedChar("banana");
        assertEquals(expected, result);
    }



}
