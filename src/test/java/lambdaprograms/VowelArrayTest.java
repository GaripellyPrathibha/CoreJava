package lambdaprograms;

import org.junit.Test;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static java.util.Arrays.asList;

import static org.junit.Assert.assertEquals;

public class VowelArrayTest {
    @Test
    public void testAll()
    {
        List<String> strList=asList("apple","banana","cat","dog");
        Map<String,Integer> result=VowelArray.print(strList);
        Map<String, Integer> expected = new HashMap<>();
        expected.put("apple", 2);
        expected.put("banana", 3);
        expected.put("cat", 1);
        expected.put("dog", 1);
        assertEquals(expected,result);
    }
    @Test
    public void test()
    {
        List<String> strList=asList("cdf","ghf","sdf","nhg");
        Map<String,Integer> result=VowelArray.print(strList);
        Map<String, Integer> expected = new HashMap<>();
        expected.put("cdf", 0);
        expected.put("ghf", 0);
        expected.put("sdf", 0);
        expected.put("nhg", 0);
        assertEquals(expected,result);
    }

    @Test
    public void testEmptyList()
    {
        List<String> strList=asList();
        Map<String,Integer> result=VowelArray.print(strList);
        Map<String, Integer> expected = new HashMap<>();
        assertEquals(expected,result);
    }

}
