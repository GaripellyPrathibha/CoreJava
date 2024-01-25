package arraylistImplementation;

import org.junit.Test;

import java.lang.reflect.Array;
import java.util.ArrayList;

import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

public class RemoveMethodTest {
    @Test
    public void testRemoveLast(){
        ArrayList<String> arr= new ArrayList<>();
        arr.add("java");
        arr.add("python");
        RemoveMethod.removeLast(arr);
        assertTrue(arr.size()==1);

    }
    @Test
    public void testRemoveLastWithEmptyArrayList()
    {
        ArrayList<String> arr= new ArrayList<>();
        RemoveMethod.removeLast(arr);
        assertTrue(arr.isEmpty());
    }
    @Test
    public void testRemoveLastWithNull()
    {
        ArrayList<String> arr= null;
        RemoveMethod.removeLast(arr);
        assertNull(arr);
    }

}
