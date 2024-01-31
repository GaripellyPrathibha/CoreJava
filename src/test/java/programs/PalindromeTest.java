package programs;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class PalindromeTest {
    @Test
    public void testPalindrome()
    {
        int input=121;
        boolean result =Palindrome.checkPalindrome(input);
        assertTrue(result);
    }
    @Test
    public void testNotPalindrome()
    {
        int input=124;
        boolean result =Palindrome.checkPalindrome(input);
        assertFalse(result);
    }

}
