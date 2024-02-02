package programs;

import org.junit.Test;

import java.util.HashMap;
import java.util.TreeMap;

import static org.junit.Assert.assertEquals;

public class SortHashMapTest {
    @Test
    public void testSorting()
    {
        HashMap<String,Integer> a=new HashMap<>();
        a.put("dog",1);
        a.put("cat",4);
        a.put("app",3);
        a.put("bat",2);
        TreeMap<String,Integer> c=new TreeMap<>();
        c.put("app",3);
        c.put("bat",2);
        c.put("cat",4);
        c.put("dog",1);
        TreeMap<String,Integer> b=SortHashMap.sortingHashMap(a);
        assertEquals(c,b);


    }
    @Test
    public void testEmptyHAshMap()
    {
        HashMap<String,Integer> a=new HashMap<>();
        TreeMap<String,Integer> b=SortHashMap.sortingHashMap(a);
        assertEquals(null,b);
    }


}
