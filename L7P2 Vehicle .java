class Vehicle {
    String brand;
    int year;
    public Vehicle(String brand, int year) {
    this.brand = brand;
    this.year = year;  }
    public void display() {
        System.out.println("Brand: " + brand);
        System.out.println("Year: " + year);
    }}
class Speed {
    double maxSpeed;
    public Speed(double maxSpeed) {
        this.maxSpeed = maxSpeed; }
    public void display() {
        System.out.println("Max Speed: " + maxSpeed + " km/h");
    }}

class Van extends Vehicle {
 Speed speed;
 public Van(String brand, int year, Speed speed) {
 super(brand, year);
 this.speed = speed; }

public void display() {
super.display();
speed.display();
    }  }