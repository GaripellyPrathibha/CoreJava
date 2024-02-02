package programs;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class UniqueHashMap {
    public static int printUniqueCount(String str)
    {
        if(str==null || str.equals(""))
        {
            return 0;
        }
        String[] words = str.split("\\s+");

        HashMap<String,Integer> strArray=new HashMap<>();
        for (String word: words)
        {
            strArray.put(word, strArray.getOrDefault(word, 0) + 1);

        }
        int count=0;
        for(Map.Entry<String,Integer> entry:strArray.entrySet())
        {
            System.out.println(entry.getKey()+ "1 "+count);
            if(entry.getValue()==1)
            {
                count++;
            }
        }
        return count;

    }
}
