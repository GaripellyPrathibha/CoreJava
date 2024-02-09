package lambdaprograms;

import java.util.Arrays;


public class SortArray {
    public static String[] sortingArr(String[] str)
    {
        return Arrays.stream(str).sorted()
                .sorted((str1,str2)->{
                    if(str1.length()!=str2.length())
                    {
                        return Integer.compare(str1.length(),str2.length());
                    }else {
                        return Character.compare(str2.charAt(str2.length()-1),str1.charAt(str1.length()-1));
                    }

                })
                .toArray(String[]::new);
    }

}
