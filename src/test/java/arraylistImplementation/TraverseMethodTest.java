package arraylistImplementation;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.Assert.*;

public class TraverseMethodTest {
    @Test
    public void testTraverseWithNonNullArrayList() {
        ArrayList<String> arr = new ArrayList<>(Arrays.asList("java", "python", "c++"));
        ArrayList<String> actualArr = TraverseMethod.traverse(arr);
        ArrayList<String> expectedArr = new ArrayList<>(Arrays.asList("java", "python", "c++"));
        assertArrayEquals(expectedArr.toArray(), actualArr.toArray());
    }

    @Test
    public void testTraverseWithEmptyArrayList() {
        ArrayList<String> emptyList = new ArrayList<>();
        ArrayList<String> actualArr = TraverseMethod.traverse(emptyList);
        assertTrue(actualArr.isEmpty());
    }

    @Test
    public void testTraverseWithNullArrayList() {
        ArrayList<String> nullList = null;
        ArrayList<String> actualArr = TraverseMethod.traverse(nullList);
        assertNull(actualArr);
    }

}
