import java.util.LinkedList;

public class RetrieveLastElement {
    public static void main(String[] args) {
       
        LinkedList<String> linkedList = new LinkedList<>();

        
        linkedList.add("A");
        linkedList.add("B");
        linkedList.add("C");
        linkedList.add("D");
        String lastElement = linkedList.getLast();

       
        System.out.println("Last element of the linked list: " + lastElement);
    }
}
