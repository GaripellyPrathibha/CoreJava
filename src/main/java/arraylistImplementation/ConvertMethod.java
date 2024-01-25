package arraylistImplementation;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class ConvertMethod {
    public static String[] convertToArray(ArrayList<String> arr)
    {
        if(arr==null)
        {
            return null;
        }
        String[] a=new String[arr.size()];
        a= arr.toArray(a);
        return a;
    }
    public static void main(String[] args)
    {

    }
}
