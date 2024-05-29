import java.util.*;
public class Programif
{
static void checkAge(int age)
{
if (age  < 18) 
{
System.out.println("Access denied - Your are not old enough!");
}
else
{
System.out.println("Access granted - You are old enough!");
}
}
public static void main(String[] args)
{
checkAge(20);
}
}
