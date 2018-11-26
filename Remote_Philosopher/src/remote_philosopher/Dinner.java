import java.util.Scanner;

class Dinner{
	
	
	private static Scanner sc;
	
	
	public static void main(String arg[]){
		
		sc = new Scanner(System.in);
		
		Fork fk= new Fork("fork");
		
		(new Server2(fk)).start();
		try{
            Thread.sleep(50);
        }catch (InterruptedException e){}
		

        System.out.println("to start clients input a line");   
        sc.nextLine();   
		
		
		int number=5;
		Philosopher ph[]= new Philosopher[number];
		
		
		
		
		
		for(int i=0; i<number;i++){		
			ph[i] = new Philosopher("P"+(i+1),fk,null);
			ph[i].start();
		}		
	}
}