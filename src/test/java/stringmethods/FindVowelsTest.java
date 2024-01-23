package stringmethods;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class FindVowelsTest {
    @Test
    public void testCountVowels() {
        String input = "Hello World";
        int result = FindVowels.countVowels(input);
        assertEquals(3, result);
    }

    @Test
    public void testCountVowelsWithNoVowels() {
        String input = "Rhythm";
        int result = FindVowels.countVowels(input);
        assertEquals(0, result);
    }

    @Test
    public void testCountVowelsWithMixedCase() {
        String input = "Programming is Fun";
        int result = FindVowels.countVowels(input);
        assertEquals(5, result);
    }
}
