package lambdaprograms;

import java.util.function.Predicate;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FilterArrayUsingPredicate {
    public static List<String> filterStrings(List<String> stringList, Predicate<String> predicate) {
        List<String> collect = stringList.stream()
                .filter(predicate)
                .collect(Collectors.toList());
        return collect;
    }
}
