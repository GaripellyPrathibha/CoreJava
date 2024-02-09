package lambdaprograms;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class MaximumElementTest {
    @Test
    public void test()
    {
        List<String> str= Arrays.asList("apple","cat","banana");
        String result=MaximumElement.findMaxElement(str);
        String expected="cat";
        assertEquals(expected,result);
    }
    @Test
    public void testEmpty()
    {
        List<String> str= Arrays.asList();
        String result=MaximumElement.findMaxElement(str);
        String expected=null;
        assertEquals(expected,result);

    }

}
