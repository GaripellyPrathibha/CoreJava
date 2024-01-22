package stringmethods;
import java.util.Arrays;
import java.util.Scanner;

public class ReverseSentence {
    public static void main(String[] args)
    {
        String str=new String();
        Scanner sc=new Scanner(System.in);
        str=sc.nextLine();
        System.out.println(str);
        String[] words=str.split(" ");
        String reverseStr="";
        for (String word:words)
        {
            StringBuilder sb=new StringBuilder(word);
            sb.reverse();
            reverseStr+=sb.toString()+" ";

        }
        System.out.println(reverseStr);

    }
}
