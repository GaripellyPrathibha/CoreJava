package arraylistImplementation;

import java.util.ArrayList;
import java.util.Scanner;

public class TraverseMethod {
    public static void traverse(ArrayList<String> arr)
    {
        for(int i=0;i<arr.size();i++)
        {
            String str= arr.get(i);
            System.out.println(str);
        }

    }
    public static void enhancedTraverse(ArrayList<String> arr)
    {
        for(String str:arr)
        {
            System.out.println(str);
        }
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
       traverse(arr);
        enhancedTraverse(arr);

    }
}
