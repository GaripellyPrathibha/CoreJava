package lambdaprograms;

import java.util.List;

public class MaximumElement {
    public static String findMaxElement(List<String> str)
    {
        return str.stream().max(String::compareTo).orElse(null) ;
    }

}
