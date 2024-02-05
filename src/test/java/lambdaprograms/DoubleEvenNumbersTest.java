package lambdaprograms;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

public class DoubleEvenNumbersTest {
    @Test
    public void test()
    {
        int[] number = {2, 1, 5, 3, 4};
        int[] expectedArray = {4, 8};
        int[] result = DoubleEvenNumbers.print(number);
        assertArrayEquals(expectedArray, result);

    }
    @Test
    public void testNegativeArray()
    {
        int[] number = {-2,-1,-5,-3,-4};
        int[] expectedArray = {-4,-8};
        int[] result = DoubleEvenNumbers.print(number);
        assertArrayEquals(expectedArray, result);

    }
    @Test
    public void testMixedArray()
    {
        int[] number = {2,-1,5,-3,-4};
        int[] expectedArray = {4,-8};
        int[] result = DoubleEvenNumbers.print(number);
        assertArrayEquals(expectedArray, result);

    }
    @Test
    public void testEmptyArray()
    {
        int[] number = {};
        int[] expectedArray = {};
        int[] result = DoubleEvenNumbers.print(number);
        assertArrayEquals(expectedArray, result);

    }

}

