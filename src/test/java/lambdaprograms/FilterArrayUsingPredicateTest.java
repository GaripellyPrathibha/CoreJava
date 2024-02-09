package lambdaprograms;

import org.junit.Test;
import java.util.function.Predicate;
import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;


public class FilterArrayUsingPredicateTest {

    @Test
    public void test()
    {
        List<String> stringList = new ArrayList<>();
        stringList.add("Apple");
        stringList.add("Ample");
        stringList.add("Banana");
        stringList.add("Dog");
        Predicate<String> startsWith = str -> str.startsWith("A");
        List<String> result = FilterArrayUsingPredicate.filterStrings(stringList, startsWith);
        List<String> expected= new ArrayList<>();
        expected.add("Apple");
        expected.add("Ample");
        assertEquals(expected,result);
    }
    @Test
    public void testEmpty()
    {
        List<String> stringList = new ArrayList<>();
        Predicate<String> startsWith = str -> str.startsWith("A");
        List<String> result = FilterArrayUsingPredicate.filterStrings(stringList, startsWith);
        List<String> expected= new ArrayList<>();
        assertEquals(expected,result);
    }
}
