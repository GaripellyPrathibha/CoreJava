package lambdaprograms;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

public class SquarePositiveArrayTest {
    @Test
    public void test()
    {
        int[] number = {-3,-2,-1,0,1,2,3};
        int result = SquarePositiveArray.printSum(number);
        assertEquals(14, result);
    }
    @Test
    public void testNegativeArray()
    {
        int[] number = {-3,-2,-4,-5,-6};
        int result = SquarePositiveArray.printSum(number);
        assertEquals(0, result);
    }
    @Test
    public void testEmptyArray()
    {
        int[] number = {};
        int result = SquarePositiveArray.printSum(number);
        assertEquals(0, result);
    }

}
