class  L8P2
{
int age;
String degree;
int number;


public L8P2(int age,String degree)
{
this.age=age;
this.degree=degree;
}
public L8P2(int age,String degree,int number)
{

this.age=age;
this.degree=degree;
this.number=number;
}
void display()
{
System.out.println("Age   : "+age);
System.out.println("Degree :"+degree);
System.out.println("Number : "+number);
}

public static void main(String args[])
{
L8P2  a= new L8P2(23,"bca,mca",63);
a.display();
}
}