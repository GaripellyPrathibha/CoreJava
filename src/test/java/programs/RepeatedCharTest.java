package programs;

import org.junit.Test;

public class RepeatedCharTest {

    @Test
    public void testPrintRepeatedChar(){
        RepeatedChar.printRepeatedChar("prathibha");
    }
    @Test
    public void testPrintWithNoDuplicatesString()
    {
        RepeatedChar.printRepeatedChar("asrith");
    }
    @Test
    public void testPrintWithDuplicatesString()
    {
        RepeatedChar.printRepeatedChar("aaaa");
    }
    @Test
    public void testEmptyString(){
        RepeatedChar.printRepeatedChar("");
    }
}
