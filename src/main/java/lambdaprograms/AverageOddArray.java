package lambdaprograms;

import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;

public class AverageOddArray {
    public static double printAverage(int[] num)
    {
        return Arrays.stream(num).filter(n -> n % 2 !=0).map(n -> n * n).average().orElse(0.0);

    }

}
