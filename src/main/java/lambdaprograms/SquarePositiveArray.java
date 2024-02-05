package lambdaprograms;

import java.util.Arrays;

public class SquarePositiveArray {
    public static int printSum(int[] num)
    {
        int sum= Arrays.stream(num).filter(n->n>0).map(n->n*n).sum();
        return sum;
    }

}
