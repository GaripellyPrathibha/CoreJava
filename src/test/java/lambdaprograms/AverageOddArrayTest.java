package lambdaprograms;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.OptionalDouble;

import static org.junit.Assert.assertEquals;

public class AverageOddArrayTest {
    @Test
    public void test()
    {
        int[] number={2,1,5,3,4};
        int avg=(int)AverageOddArray.printAverage(number);
        assertEquals(11,avg);
    }
    @Test
    public void testNegativeNumbers()
    {
        int[] number={-2,-1,-5,-3,-4};
        int avg=(int)AverageOddArray.printAverage(number);
        assertEquals(11,avg);

    }
    @Test
    public void testMixedNumbers()
    {
        int[] number={2,-1,5,-3,4};
        int avg=(int)AverageOddArray.printAverage(number);
        assertEquals(11,avg);

    }
    @Test
    public void testEmptyArray()
    {
        int[] number={};
        int avg=(int)AverageOddArray.printAverage(number);
        assertEquals(0,avg);

    }





}
