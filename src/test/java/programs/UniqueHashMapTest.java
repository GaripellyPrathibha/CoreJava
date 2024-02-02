package programs;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class UniqueHashMapTest {
    @Test
    public void testUniqueString()
    {
        String input="hello Prathibha";
        int result=UniqueHashMap.printUniqueCount(input);
        assertEquals(2,result);
    }
    @Test
    public void testDuplicateString()
    {
        String input="hello hello hello";
        int result=UniqueHashMap.printUniqueCount(input);
        assertEquals(0,result);

    }
    @Test
    public void testEmptyString()
    {
        String input="";
        assertEquals(0,UniqueHashMap.printUniqueCount(input));
    }
    @Test
    public void testNull()
    {
        String input=null;
        assertEquals(0,UniqueHashMap.printUniqueCount(input));
    }



}
