package arraylistImplementation;

import java.util.ArrayList;
import java.util.Scanner;

public class RemoveMethod {
    public static void removeLast(ArrayList<String> arr)
    {
        if(arr==null)
        {
            return;
        }
        if(arr.isEmpty())
        {
            return;
        }
        int i=arr.size();
        arr.remove(i-1);
        for(String str:arr)
        {
            System.out.println(str);
        }
    }
    public static void main(String[] args)
    {

    }
}
