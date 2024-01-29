package HashImplementation;
import java.util.HashSet;
import java.util.Iterator;
public class HashSetLoop {
    static void iterateUsingIterator(HashSet<String> set) {
        Iterator<String> iterator = set.iterator();
        while (iterator.hasNext()) {
            String element = iterator.next();
            System.out.println(element);
        }
    }
    static void forLoop(HashSet<String> set) {
        Object[] elements = set.toArray();
        for (int i = 0; i < elements.length; i++) {
            String element = (String) elements[i];
            System.out.println(element);
        }
    }


    static void enhancedForLoop(HashSet<String> set) {
        for (String element : set) {
            System.out.println(element);
        }
    }
}
