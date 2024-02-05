package lambdaprograms;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class AlphabeticArrayTest {

    @Test
    public void test()
    {
        String[] str={"one","two","three","four","five"};
        String[] expectedArr={"Five","Four","One","Three","Two"};
        String[] result=AlphabeticArray.printAlphabeticArray(str);
        assertArrayEquals(expectedArr,result);

    }
    @Test
    public void testAllCapital()
    {
        String[] str={"ONE","TWO","THREE","FOUR","FIVE"};
        String[] expectedArr={"FIVE","FOUR","ONE","THREE","TWO"};
        String[] result=AlphabeticArray.printAlphabeticArray(str);
        assertArrayEquals(expectedArr,result);

    }
    @Test
    public void testCapital()
    {
        String[] str={"1","2","3"};
        String[] expectedArr={"1","2","3"};
        String[] result=AlphabeticArray.printAlphabeticArray(str);
        assertArrayEquals(expectedArr,result);
    }

    @Test
    public void testEmpty()
    {
        String[] str={};
        String[] expectedArr={};
        String[] result=AlphabeticArray.printAlphabeticArray(str);
        assertArrayEquals(expectedArr,result);
    }


}
