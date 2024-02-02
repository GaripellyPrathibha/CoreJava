package programs;

import java.util.HashMap;
import java.util.TreeMap;

public class SortHashMap {
    static TreeMap<String,Integer> sortingHashMap(HashMap<String,Integer> arr)
    {
        if(arr.isEmpty())
        {
            return null;
        }
        TreeMap<String,Integer> tree=new TreeMap<String,Integer>(arr);
        return tree;

    }


}
