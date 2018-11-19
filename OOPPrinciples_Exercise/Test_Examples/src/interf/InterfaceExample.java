package interf;

public class InterfaceExample{
    public static void main(String[] args){
        Animal dog = new Dog();
        Animal bird = new Bird();
        
        moveAndSound(dog);
        System.out.println();
        moveAndSound(bird);
    }
    
    
    static void moveAndSound(Animal animal){
        animal.move();
        System.out.println(animal.makeSound());
    }
    
}