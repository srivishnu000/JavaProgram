import java.util.*;

public class L3p2
{
public static void main (String args[])
{
          Scanner sc=new Scanner(System.in);
          System.out.println(" Square indicates case 1,  Rectangle indicates case 2,   circle indicates case 3");
          int input=sc.nextInt();

switch(input) 
{
case 1:

System.out.println("eneter the sides");
int sides =sc.nextInt();
int Square =4*sides;
System.out.println("perimeter of the square is:  " +Square);
break;

case 2:

System.out.println("enter the length and breadth");
int l=sc.nextInt();
int b=sc.nextInt();
int rect=2*(1+b);
System.out.println("perimeter of the circle is: " +rect);
break;

case 3:

System.out.println("enter the radius");
int radius=sc.nextInt();
int circle=2*(22/7)*radius;
System.out.println("perimeter of the circle:  " +circle);
break;

default:

System.out.println("please enter the valid Input");
break;
}
}
}