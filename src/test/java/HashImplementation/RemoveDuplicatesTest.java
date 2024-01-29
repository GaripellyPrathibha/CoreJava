package HashImplementation;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RemoveDuplicatesTest {
    @Test
    public void testEmptyString() {
        String input = "";
        String expected = "";

        String result = RemoveDuplicates.removeDuplicatesHashSet(input);

        assertEquals(expected, result);
    }

    @Test
    public void testNoDuplicates() {
        String input = "abcdef";
        String expected = "abcdef";
        String result = RemoveDuplicates.removeDuplicatesHashSet(input);
        assertEquals(expected, result);
    }

    @Test
    public void testWithDuplicates() {
        String input = "aabbbccee";
        String expected = "abc";
        String result = RemoveDuplicates.removeDuplicatesHashSet(input);
        assertEquals(expected, result);
    }

    @Test
    public void testWithSpaces() {
        String input = "abc def ghi";
        String expected = "abc def ghi";
        String result = RemoveDuplicates.removeDuplicatesHashSet(input);
        assertEquals(expected, result);
    }

    @Test
    public void testWithCaseDifference() {
        String input = "abcABC";
        String expected = "abcABC";
        String result = RemoveDuplicates.removeDuplicatesHashSet(input);
        assertEquals(expected, result);
    }
}
