import java.util.ArrayList;
class Prog3{
 public static void main(String[] args){
  ArrayList<String> text = new ArrayList<>();
    text.add("Java");
    text.add("is");
    text.add("fun");
String result;
result = String.join(" ", text);
System.out.println(result);
}
}
