package lambdaprograms;

import org.junit.Test;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.junit.Assert.assertEquals;

public class GroupByTest {
    @Test
    public void test()
    {
        List<String> string1 = Arrays.asList("apple","cat", "dog");
        Map<Integer, List<String>> result = Groupby.groupingStringsByLentgh(string1);
        Map<Integer, List<String>> expected=new HashMap<>();
        expected.put(3, Arrays.asList("cat", "dog"));
        expected.put(5, Arrays.asList("apple"));
        assertEquals(expected,result);
    }
    @Test
    public void testEmptyArray()
    {
        List<String> string1 = Arrays.asList();
        Map<Integer, List<String>> result = Groupby.groupingStringsByLentgh(string1);
        Map<Integer, List<String>> expected=new HashMap<>();
        assertEquals(expected,result);
    }

}
