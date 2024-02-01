package programs;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class RepeatedDigits {
    static List<Integer> countRepeatedDigits(int n)
    {
        if(n == 0 || n<0) {
            return new ArrayList<>();
        }
        HashMap<Integer,Integer> intArray=new HashMap<>();
        int j = 0;
        int len = Integer.toString(n).length();
        int[] arr = new int[len];
        while(n!=0)
        {
            arr[len-j-1] = n%10;
            n=n/10;
            j++;
        }
        for(int i:arr)
        {
            intArray.put(i, intArray.getOrDefault(i, 0) + 1);
        }
        List<Integer> repeatedDigits = new ArrayList<>();
        for(Map.Entry<Integer,Integer> entry:intArray.entrySet())
        {
            if(entry.getValue()>1)
            {
                repeatedDigits.add(entry.getKey());
            }
        }
        return repeatedDigits;


    }
}
