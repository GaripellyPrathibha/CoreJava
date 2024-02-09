package lambdaprograms;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Groupby {
    public Map<Integer, List<String>> groupingStringsByLentgh(List<String> str)
    {
        return str.stream().collect(Collectors.groupingBy(String::length));
    }

}
