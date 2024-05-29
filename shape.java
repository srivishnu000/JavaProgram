import java.util.*;
class Shape {
protected String color;
protected String size;
protected int[] position;
public Shape(String color, String size, int[] position) {
  this.color = color;
   this.size = size;
   this.position = position;
}
public void draw() {
System.out.println("Drawing " + color + " " + size + " shape at position (" + position[0] + ", " + position[1] + ")");    }
public void resize(String newSize) {
 size = newSize;
 System.out.println("Resizing shape to " + size);    }
 public void move(int[] newPosition) {
 position = newPosition;
 System.out.println("Moving shape to position (" + position[0] + ", " + position[1] + ")");    }}

class Circle extends Shape {
    private double radius;
    public Circle(String color, String size, int[] position, double radius) {
        super(color, size, position);
        this.radius = radius;    }
    public double calculateArea() {
        return Math.PI * radius * radius;  }
    public double calculatePerimeter() {
        return 2 * Math.PI * radius;
    }
}
class Square extends Shape {
    private double sideLength;
    public Square(String color, String size, int[] position, double sideLength) {
        super(color, size, position);
        this.sideLength = sideLength;    }
    public double calculateArea() {
        return sideLength * sideLength;
    }
    public double calculatePerimeter() {
        return 4 * sideLength;
    }}
class Triangle extends Shape {
    private double baseLength;
    private double height;
    private double[] sideLengths;
    public Triangle(String color, String size, int[] position, double baseLength, double height, double[] sideLengths) {
        super(color, size, position);
        this.baseLength = baseLength;
        this.height = height;
        this.sideLengths = sideLengths;
    }
    public double calculateArea() {
        return 0.5 * baseLength * height;
    }
    public double calculatePerimeter() {
        double perimeter = 0;
        for (double side : sideLengths) {
            perimeter += side;
        }        return perimeter;   }  }