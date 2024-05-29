import java.util.*;
public class CommandLineArguments
{
  public static void main(String args[])
{
   int num1,num2;
   if(args.length >0)
{
   try{
          System.out.println("Sum of inputted numbers");
     System.out.println(num1 + num2);
   } catch (NumberFormatException e)
{
     System.err.println("Arguments must be an integer.");
   }
  }
 }
}