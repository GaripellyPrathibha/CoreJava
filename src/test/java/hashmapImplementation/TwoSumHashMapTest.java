package hashmapImplementation;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class TwoSumHashMapTest {
    @Test
    public void testTwoSumWithValidPair() {
        int[] input = {10, 20, 30, 40, 50, 60};
        int target = 100;
        assertArrayEquals(new int[]{3, 5}, TwoSumHashMap.findIndices(input, target));
    }

    @Test
    public void testTwoSumWithAnotherValidPair() {
        int[] input = {1, 2, 3, 4, 5};
        int target = 9;
        assertArrayEquals(new int[]{3, 4}, TwoSumHashMap.findIndices(input, target));
    }

    @Test
    public void testTwoSumWithValidPairAtBeginning() {
        int[] input = {5, 10, 15, 20};
        int target = 15;
        assertArrayEquals(new int[]{0, 1}, TwoSumHashMap.findIndices(input, target));
    }

    @Test
    public void testTwoSumWithNoValidPair() {
        int[] input = {1, 2, 3, 4, 5};
        int target = 11;
        assertArrayEquals(new int[]{-1, -1}, TwoSumHashMap.findIndices(input, target));
    }

    @Test
    public void testTwoSumWithNegativeNumbers() {
        int[] input = {-5, -3, -1, 0, 2, 4, 6};
        int target = 1;
        assertArrayEquals(new int[]{2, 4},  TwoSumHashMap.findIndices(input, target));
    }

    @Test
    public void testTwoSumWithEmptyArray() {
        int[] input = {};
        int target = 5;
        assertArrayEquals(new int[]{-1, -1},  TwoSumHashMap.findIndices(input, target));
    }
}
