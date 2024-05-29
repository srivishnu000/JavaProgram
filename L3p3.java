import java.util.*;
class L3p3
{
	public static void main(String arg[])
	{
                Scanner obj=new Scanner(System.in);
	        System.out.println("Enter A Number:");
		   int a = obj.nextInt();
                System.out.println("Enter B Number:");
                   int b = obj.nextInt();
                
    
a %=b;
System.out.println("A %= B   :    "+a);
a +=b;
System.out.println("A += B   :    "+a);
a -=b;
System.out.println("A -= B   :    "+a);
a *=b;
System.out.println("A *= B   :    "+a);
a /=b;
System.out.println("A /= B   :    "+a);

}
}