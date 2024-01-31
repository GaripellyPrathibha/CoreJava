package programs;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FactorialTest {
    @Test
    public void testFactorial()
    {
        int a=5;
        int result=Factorial.checkFactorial(a);
        assertEquals(120,result);
    }
    @Test
    public void testZero()
    {
        int a=0;
        int result=Factorial.checkFactorial(a);
        assertEquals(1,result);
    }
}
