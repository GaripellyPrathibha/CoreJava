package arraylistImplementation;

import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertArrayEquals;

public class ConvertMethodTest {
    @Test
    public void testConvertToArray()
    {
        ArrayList<String> arr=new ArrayList<>();
        arr.add("java");
        arr.add("python");
        arr.add("c++");
        String[] stringArr=ConvertMethod.convertToArray(arr);
        String[] expectedArr={"java","python","c++"};
        assertArrayEquals(expectedArr,stringArr);
    }
    @Test
    public void testConvertToArrayWithEmptyArray()
    {
        ArrayList<String> arr=new ArrayList<>();
        String[] stringArr=ConvertMethod.convertToArray(arr);
        String[] expectedArr={};
        assertArrayEquals(expectedArr,stringArr);
    }
    @Test
    public void testConvertToArrayWithNullArray(){
        ArrayList<String> arr=null;
        String[] stringArr=ConvertMethod.convertToArray(arr);
        assertArrayEquals(null,stringArr);


    }

}
