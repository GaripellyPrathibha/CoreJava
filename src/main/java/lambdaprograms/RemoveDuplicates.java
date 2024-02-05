package lambdaprograms;

import java.util.Arrays;

public class RemoveDuplicates {
    public static int[] removeDuplicatesArray(int[] arr)
    {
        return Arrays.stream(arr).distinct().toArray();
    }

}
