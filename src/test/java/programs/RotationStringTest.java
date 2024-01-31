package programs;

import org.junit.Test;
import stringmethods.RotateString;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class RotationStringTest {
    @Test public void testRotateStringPositive() {
        String str1 = "abcde";
        String str2 = "deabc";
        boolean result = RotationString.isRotatedString(str1, str2);
        assertTrue(result);
    }
    @Test
    public void testRotateStringNegative() {
        String str1 = "hello";
        String str2 = "world";
        boolean result = RotationString.isRotatedString(str1, str2);
        assertFalse(result);
    }
    @Test
    public void testRotateStringEmptyStrings() {
        String str1 = " ";
        String str2 = " ";
        boolean result = RotationString.isRotatedString(str1, str2);
        assertTrue(result);
    }
}
