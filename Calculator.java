public class Calculator
{
       public double Area(double radius){
            return 3.14*radius*radius;
       }
      public double Area(double height,double base){
          return (height*base)/2;
      }
      public double Area(int length,int height){
         return length*height;
     }
     public static void main(String args[]){
        
        Calculator c=new Calculator();
         double circle= c.Area(5.6);
         double triangle= c.Area(2.6,7.5);
         double rectangle= c.Area(4.2,2.1);

         System.out.println("Area of circle" +circle);
         System.out.println("Area of triangle" +triangle);
         System.out.println("Area of rectangle" +rectangle);
         
}
}