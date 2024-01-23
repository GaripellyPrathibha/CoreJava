package stringmethods;
import org.junit.Test;
import static org.junit.Assert.*;
public class RotateStringTest {
    @Test
    public void testRotateStringPositive() {
        String str1 = "abcde";
        String str2 = "deabc";
        boolean result = RotateString.isRotatedString(str1, str2);
        assertTrue(result);
    }
    @Test
    public void testRotateStringNegative() {
        String str1 = "hello";
        String str2 = "world";
        boolean result = RotateString.isRotatedString(str1, str2);
        assertFalse(result);
    }
    @Test
    public void testRotateStringEmptyStrings() {
        String str1 = "";
        String str2 = "";
        boolean result = RotateString.isRotatedString(str1, str2);
        assertTrue(result);
    }
}

