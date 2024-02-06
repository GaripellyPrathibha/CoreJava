package exceptionhandling;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ConversionTest {
    @Test
    public void test()
    {
        String str="123";
        int result=Conversion.convertStringToInt(str);
        assertEquals(123,result);

    }
    @Test
    public void testString()
    {
        String str="test";
        int result=Conversion.convertStringToInt(str);
        assertEquals(0,result);

    }
    @Test
    public void testDouble()
    {
        String str="45.67";
        int result=Conversion.convertStringToInt(str);
        assertEquals(0,result);

    }
    @Test
    public void testMixedString()
    {
        String str="123f";
        int result=Conversion.convertStringToInt(str);
        assertEquals(0,result);
    }

}
