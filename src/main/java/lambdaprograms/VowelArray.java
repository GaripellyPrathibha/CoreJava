package lambdaprograms;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class VowelArray {
    public static Map<String,Integer> print(List<String> strList)
    {
        return strList.stream().collect(Collectors.toMap(str->str,VowelArray::countVowels));
    }
    static int countVowels(String str)
    {
        return (int) str.chars().filter(c->"aeiouAEIOU".indexOf(c)!=-1).count();
    }

}
