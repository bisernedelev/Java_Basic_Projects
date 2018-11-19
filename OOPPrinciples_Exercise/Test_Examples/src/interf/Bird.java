package interf;

public class Bird implements Animal{

    public void move() {
        System.out.println("flying");
    }
    
    public String makeSound() {
        return "ga ga ga";
    }
}