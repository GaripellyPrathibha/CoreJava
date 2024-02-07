package lambdaprograms;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FIExampleTest {
    @Test
    public void testAddition() {
        MathOperation addition = (a, b) -> a + b;
        int result = addition.operate(4, 6);
        assertEquals(10, result);
    }
    @Test
    public void testNegativeNumbersAddition() {
        MathOperation addition = (a, b) -> a + b;
        int result = addition.operate(-4, -6);
        assertEquals(-10, result);
    }
}
