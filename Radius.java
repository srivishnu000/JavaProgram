import java.util.*;
public class Radius
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
while(true){
System.out.println("do you want find a radius or not?");
String s=sc.nextLine().toLowerCase();
if(s.equals("yes"))
{
System.out.println("enter the radius");G
double a=sc.nextDouble();
double area=a*a*Math.PI;
System.out.println("the area of the circle" +a+ "is" +area);
break;
}
else if(s.equals("no")){
break;
}
else{
System.out.println("invalid input");
}
}
}
}