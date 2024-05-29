import java.util.HashSet;
import java.util.Iterator;

public class HashSetTraversal {
    public static void main(String[] args) {
               HashSet<String> hashSet = new HashSet<>();

               hashSet.add("Apple");
        hashSet.add("Banana");
        hashSet.add("Orange");
        hashSet.add("Grapes");

        Iterator<String> iterator = hashSet.iterator();
        while (iterator.hasNext()) {
            String element = iterator.next();
            System.out.println(element);
        }
    }
}