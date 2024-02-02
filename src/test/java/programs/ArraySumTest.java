package programs;

import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class ArraySumTest {
    @Test
    public void testEmptyArray()
    {
        ArrayList<Integer> arr=new ArrayList<>();
        int sum=ArraySum.printSum(arr);
        assertEquals(0,sum);

    }
    @Test
    public void testPositiveArray()
    {
        ArrayList<Integer> arr=new ArrayList<>();
        arr.add(1);
        arr.add(2);
        arr.add(3);
        arr.add(4);
        int sum=ArraySum.printSum(arr);
        assertEquals(10,sum);

    }
    @Test
    public void testNegativeArray()
    {
        ArrayList<Integer> arr=new ArrayList<>();
        arr.add(-1);
        arr.add(-2);
        arr.add(-3);
        arr.add(-4);
        int sum=ArraySum.printSum(arr);
        assertEquals(-10,sum);

    }
    @Test
    public void testArray()
    {
        ArrayList<Integer> arr=new ArrayList<>();
        arr.add(1);
        arr.add(2);
        arr.add(-3);
        arr.add(-4);
        int sum=ArraySum.printSum(arr);
        assertEquals(-4,sum);

    }


}
