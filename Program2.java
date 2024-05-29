import java.util.*;
class Program2
{
public static void main(String args[])
{
Scanner obj=new Scanner(System.in);
System.out.println("Enter a Number to Reverse");
try{
int number = obj.nextInt();
System.out.println("Reverse number:"+ new StringBuilder(String.valueOf(number)).reverse());
}
catch(Exception e)
{
System.out.println("Input is not valid");
}
}
}
