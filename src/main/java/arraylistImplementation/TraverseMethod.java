package arraylistImplementation;

import java.util.ArrayList;
import java.util.Scanner;

public class TraverseMethod {
    public static ArrayList<String> traverse(ArrayList<String> arr)
    {
        ArrayList<String> result = new ArrayList<>();
        if (arr == null) {
            System.out.println("ArrayList is null");
            return null;
        } else if (arr.isEmpty()) {
            System.out.println("ArrayList is empty");
        } else {
            for (int i = 0; i < arr.size(); i++) {
                String str = arr.get(i);
                result.add(str);
            }
        }
        return result;

    }
    public static ArrayList<String> enhancedTraverse(ArrayList<String> arr)
    {
        ArrayList<String> result = new ArrayList<>();
        if (arr == null) {
            System.out.println("ArrayList is null");
        } else if (arr.isEmpty()) {
            System.out.println("ArrayList is empty");
        } else {
            for (String str : arr) {
                System.out.println(str);
                result.add(str);
            }
        }
        return result;
    }
    public static void main(String[] args)
    {

    }
}
