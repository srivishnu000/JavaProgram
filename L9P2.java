

public class L9P2
 {
    public static void main(String[] args)
 {
        String str = "Hello";
        
                char firstChar = str.charAt(0);
        System.out.println("First character of the string: " + firstChar);
        
                int index = 2; // Index of the character you want to extract
        char charAtIndex = str.charAt(index);
        System.out.println("Character at index " + index + ": " + charAtIndex);
    }
}
