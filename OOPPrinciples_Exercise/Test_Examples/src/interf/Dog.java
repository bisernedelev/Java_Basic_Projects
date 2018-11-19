package interf;

public class Dog implements Animal{

    public String name;
    
    public void move() {
        System.out.println("moving my 4 feet");
    }

    public String makeSound() {
        return "Woof";
    }
    
}