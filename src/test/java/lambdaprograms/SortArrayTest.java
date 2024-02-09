package lambdaprograms;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class SortArrayTest {


    @Test
    public void test()
    {
        String[] str1={"apple","banana","cat","dog"};
        String[] str2=SortArray.sortingArr(str1);
        String[] expected={"cat","dog","apple","banana"};
        assertArrayEquals(expected,str2);
    }
    @Test
    public void testSameLength()
    {
        String[] str1={"cat","can","cab","cap"};
        String[] str2=SortArray.sortingArr(str1);
        String[] expected={"cat","cap","can","cab"};
        assertArrayEquals(expected,str2);

    }
    @Test
    public void testEmptyArray()
    {
        String[] str1={};
        String[] str2=SortArray.sortingArr(str1);
        String[] expected={};
        assertArrayEquals(expected,str2);
    }



}
