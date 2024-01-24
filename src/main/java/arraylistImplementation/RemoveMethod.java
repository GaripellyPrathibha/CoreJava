package arraylistImplementation;

import java.util.ArrayList;
import java.util.Scanner;

public class RemoveMethod {
    public static void removeLast(ArrayList<String> arr)
    {
        int i=arr.size();
        arr.remove(i-1);
        for(String str:arr)
        {
            System.out.println(str);
        }
        System.out.println(arr.size());
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
        removeLast(arr);
    }
}
