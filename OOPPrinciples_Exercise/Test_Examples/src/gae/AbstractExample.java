package gae;

public class AbstractExample{
    public static void main(String[] args){
      
        
        Pincher pincher = new Pincher();
        Pitbull pitbull = new Pitbull();
        
        pincher.move();
        pincher.makeSound();
        
        System.out.println();
        
        pitbull.move();
        System.out.println(pitbull.makeSound());
        
        System.out.println();
        
        System.out.println("Pincher color: " + pincher.color() );
        System.out.println("Pitbull color: " + pitbull.color());
    }
}