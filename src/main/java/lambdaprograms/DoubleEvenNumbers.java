package lambdaprograms;

import java.util.Arrays;

public class DoubleEvenNumbers {
    public static int[] print(int[] num)
    {
        int[] evenArray=Arrays.stream(num).filter(n->n%2!=0).map(n->n+n).toArray();
        return evenArray;
    }
}
