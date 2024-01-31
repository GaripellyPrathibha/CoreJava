package programs;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static programs.Swapping.swap;

public class SwappingTest {

    @Test
    public void testSwap() {
        int a=1,b=2;
        int[] result=Swapping.swap(a,b);
        assertEquals(b,result[0]);
        assertEquals(a,result[1]);

    }

    @Test
    public void testSwapWithNegativeValues() {
        int a = -10,b = -20;
        int[] result=Swapping.swap(a,b);
        assertEquals(b,result[0]);
        assertEquals(a,result[1]);
    }

}
