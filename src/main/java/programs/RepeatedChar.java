package programs;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class RepeatedChar {
    public static List<Character> printRepeatedChar(String str)
    {
        if(str == null || str.trim().isEmpty()) {
            return new ArrayList<>();
        }

        HashMap<Character,Integer> strArray=new HashMap<>();
        for (char ch:str.toCharArray())
        {
           strArray.put(ch, strArray.getOrDefault(ch, 0) + 1);

        }
        List<Character> repeatedChars = new ArrayList<>();
        for(Map.Entry<Character, Integer> entry : strArray.entrySet()) {
            if(entry.getValue() > 1) {
                repeatedChars.add(entry.getKey());
            }
        }

        return repeatedChars;
        /*for(Map.Entry<Character,Integer> entry:strArray.entrySet())
        {
            if(entry.getValue()>1)
            {
                System.out.println(entry.getKey()+ " ");
            }
        }*/

    }

}
