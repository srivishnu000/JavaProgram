import java.util.*; 
class Animal
 {
    public void eat()
 {
        System.out.println("Animal is eating.");
    }
    
    public void behavior() {
        System.out.println("Animal behavior varies.");
    }
}

class Cat extends Animal {
    public void eat() {
        System.out.println("Cat is eating.");
    }
    
    public void behavior() {
        System.out.println("Cat behavior: Meow and play.");
    }
}

class Dog extends Animal 
{
    public void eat() {
        System.out.println("Dog is eating.");
    }
    
    public void behavior() {
        System.out.println("Dog behavior: Bark and fetch.");
    }
}