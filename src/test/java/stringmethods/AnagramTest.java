package stringmethods;
import org.junit.Test;
import static org.junit.Assert.*;
public class AnagramTest {
    @Test
    public void testAreAnagrams() {
        String str1 = "listen";
        String str2 = "silent";
        boolean result = Anagram.areAnagrams(str1, str2);
        assertTrue(result);
    }
    @Test
    public void testAreNotAnagrams() {
        String str1 = "hello";
        String str2 = "world";
        boolean result = Anagram.areAnagrams(str1, str2);
        assertFalse(result);
    }

    @Test
    public void testMixedCaseAnagrams() {
        String str1 = "Tea";
        String str2 = "Eat";
        boolean result = Anagram.areAnagrams(str1, str2);
        assertTrue(result);
    }

    @Test
    public void testDifferentLengthStrings() {
        String str1 = "hello";
        String str2 = "hello world";
        boolean result = Anagram.areAnagrams(str1, str2);
        assertFalse(result);
    }

}
