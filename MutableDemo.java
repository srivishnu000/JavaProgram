public class MutableDemo 
{
private String name;
 {
this.name = name;
}
public String getName() 
{
return name;
}
public void setName(String name) 
{
this.name = name;
}
public static void main(String[] args) {
MutableDemo obj = new MutableDemo("hello1");
System.out.println(obj.getName());
Obj.setName("new hello1");
System.out.println(obj.getName());
}
}