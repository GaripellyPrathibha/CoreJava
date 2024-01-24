package arraylistImplementation;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class ConvertMethod {
    public static String[] convertToArray(ArrayList<String> arr)
    {
        String[] a=new String[arr.size()];
        a= arr.toArray(a);
        return a;
    }
    public static void main(String[] args)
    {
        ArrayList<String> arr=new ArrayList<>();
        Scanner sc=new Scanner(System.in);
        while(true)
        {
            String str=sc.nextLine();
            if(str.equalsIgnoreCase("exit"))
            {
                break;
            }
            arr.add(str);
        }
        String[] stringArr=convertToArray(arr);
        for (String s:stringArr)
        {
            System.out.println(s);
        }
    }



}
