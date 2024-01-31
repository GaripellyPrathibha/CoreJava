package programs;

import java.util.HashMap;
import java.util.Map;

public class RepeatedChar {
    public static void printRepeatedChar(String str)
    {
        if(str==null || str==" ")
        {
            return ;
        }
        HashMap<Character,Integer> strArray=new HashMap<>();
        for (char ch:str.toCharArray())
        {
           strArray.put(ch, strArray.getOrDefault(ch, 0) + 1);

        }
        for(Map.Entry<Character,Integer> entry:strArray.entrySet())
        {
            if(entry.getValue()>1)
            {
                System.out.println(entry.getKey()+ " ");
            }
        }

    }

}
