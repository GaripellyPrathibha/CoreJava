package programs;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class RepeatedDigitsTest {
    @Test
    public void testDigits() {
        List<Integer> result = RepeatedDigits.countRepeatedDigits(-1234);
        assertEquals(0, result.size());
    }
    @Test
    public void testSingleDigit() {
        List<Integer> result = RepeatedDigits.countRepeatedDigits(4);
        assertEquals(0, result.size());
    }
    @Test
    public void testDuplicateDigits() {
        List<Integer> expected = new ArrayList<>();
        expected.add(1);
        expected.add(2);
        List<Integer> result = RepeatedDigits.countRepeatedDigits(1212);
        assertEquals(2, result.size());
    }

}
