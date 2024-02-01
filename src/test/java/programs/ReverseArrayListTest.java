package programs;

import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class ReverseArrayListTest {
    @Test
    public void testReverseEmptyList() {
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<Integer> reversed = ReverseArrayList.reverse(list);
        assertEquals(list, reversed);
    }

    @Test
    public void testReverseList() {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);

        ArrayList<Integer> expected = new ArrayList<>();
        expected.add(3);
        expected.add(2);
        expected.add(1);

        ArrayList<Integer> reversed = ReverseArrayList.reverse(list);
        assertEquals(expected, reversed);
    }
}
