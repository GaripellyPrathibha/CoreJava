package programs;

import java.util.HashMap;
import java.util.Map;

public class UniqueHashMap {
    public static int printUniqueCount(String str)
    {
        if(str==null || str.equals(" "))
        {
            return 0;
        }
        HashMap<Character,Integer> strArray=new HashMap<>();
        for (char ch:str.toCharArray())
        {
            strArray.put(ch, strArray.getOrDefault(ch, 0) + 1);

        }
        int count=0;
        for(Map.Entry<Character,Integer> entry:strArray.entrySet())
        {
            if(entry.getValue()==1)
            {
                count++;
            }
        }
        return count;

    }
}
