package lambdaprograms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Stream;

public class AlphabeticArray {
    public static String[] printAlphabeticArray(String[] arr)
    {
        return Arrays.stream(arr).map(s->s.substring(0,1).toUpperCase()+s.substring(1)).sorted().toArray(String[]::new);
    }

}
