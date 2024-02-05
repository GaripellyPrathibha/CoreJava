package lambdaprograms;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class RemoveDuplicatesTest {
    @Test
    public void test()
    {
        int[] number={1,2,3,4,2,1,3};
        int[] expected={1,2,3,4};
        int[] result=RemoveDuplicates.removeDuplicatesArray(number);
        assertArrayEquals(expected,result);

    }
    @Test
    public void testNegativeNumbers()
    {
        int[] number={-1,-2,-3,-1,-2,-1};
        int[] expected={-1,-2,-3};
        int[] result=RemoveDuplicates.removeDuplicatesArray(number);
        assertArrayEquals(expected,result);

    }

    @Test
    public void testAllNonDuplicates()
    {
        int[] number={1,2,3,4,5,6,7};
        int[] expected={1,2,3,4,5,6,7};
        int[] result=RemoveDuplicates.removeDuplicatesArray(number);
        assertArrayEquals(expected,result);

    }


    @Test
    public void testEmptyArray()
    {
        int[] number={};
        int[] expected={};
        int[] result=RemoveDuplicates.removeDuplicatesArray(number);
        assertArrayEquals(expected,result);
    }


}
