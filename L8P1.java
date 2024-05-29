
public class L8P1
{
    public static void main(String[] args)
 {
   Circle circle = new Circle("red", "large", new int[]{0, 0}, 5);
   circle.draw();
   System.out.println("Area: " + circle.calculateArea());
   System.out.println("Perimeter: " + circle.calculatePerimeter());
   Square square = new Square("blue", "medium", new int[]{5, 5}, 4);
   square.draw();
   System.out.println("Area: " + square.calculateArea());
   System.out.println("Perimeter: " + square.calculatePerimeter());

       Triangle triangle = new Triangle("green", "small", new int[]{-3, -3}, 6, 4, new double[]{5, 5, 6});
        triangle.draw();
     System.out.println("Area: " + triangle.calculateArea());
     System.out.println("Perimeter: " + triangle.calculatePerimeter());
    }
}