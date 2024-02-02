package programs;

import java.util.ArrayList;

public class ArraySum {
    public static int printSum(ArrayList<Integer> arr)
    {
        if(arr.isEmpty())
        {
            return 0;
        }
        int total =0;
        for(int i=0;i< arr.size();i++)
        {
            total+= arr.get(i);
        }
        return total;
    }

}
