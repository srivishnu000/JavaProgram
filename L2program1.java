import java.util.*;
public class L2program1
{
public static void main(String args[])
{
Scanner obj=new Scanner(System.in);
System.out.println("Enter A number");
int a = obj.nextInt();
System.out.println("Enter B number");
int b = obj.nextInt();
System.out.println("Enter C number");
int c = obj.nextInt();

if((a>b)&&(a>c))
{
System.out.println("A is greater");
}
else if((b>c)&&(b>a))
{
System.out.println("B is greater");
}
else
{
System.out.println("C is greater");
}
}
}