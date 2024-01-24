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

}
