package stringmethods;
import org.junit.Test;
import static org.junit.Assert.*;
public class ReverseSentenceTest {
    @Test
    public void testReverseSentence() {
        String input = "Hello World";
        String expectedOutput = "olleH dlroW";
        String result = ReverseSentence.reverseSentence(input);
        assertEquals(expectedOutput, result);
    }

    @Test
    public void testReverseSentenceWithEmptyString() {
        String input = "";
        String expectedOutput = "";
        String result = ReverseSentence.reverseSentence(input);
        assertEquals(expectedOutput, result);
    }

    @Test
    public void testReverseSentenceWithSingleWord() {
        String input = "Java";
        String expectedOutput = "avaJ";
        String result = ReverseSentence.reverseSentence(input);
        assertEquals(expectedOutput, result);
    }
}
