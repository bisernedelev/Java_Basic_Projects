import java.io.PrintWriter;

class Philosopher extends Thread{
	String name;
	Fork fork;
	private PrintWriter out;
	Philosopher(String name,Fork fork,PrintWriter out){
		this.name=name;
	super.setName(name);
		this.fork=fork;
		this.out=out;
	}
	
	
	
	public void run(){
		
			fork.take(this);
			if (out!=null){
	        	out.println("Taking the Fork");
			}
	        	
		  try {
			  System.out.println(name+" Eating ");
		      sleep((int)(Math.random()*50));
            } catch (InterruptedException e){}
		  if (out!=null){
	        	out.println("Eating");
		  }
		     	try {
		         		sleep((int)(Math.random()*1000));
		     	} catch (InterruptedException e){}
		     	System.out.println(name+" Stop Eating");
		     	if (out!=null){
		        	out.println("Stop Eating");
		     	}
		     	
		     	fork.pose();
		     	System.out.println(name+" Poses the fork");
		     	if (out!=null){
		        	out.println("Poses the fork");
		     	}
		     	try {
		         		sleep((int)(Math.random()*1000));
		     	} catch (InterruptedException e1){}
		System.out.println(name+" Thinking");
		if (out!=null){
        	out.println("Thinking");
		}	
        	
		try {
     		sleep((int)(Math.random()*1000));
 	} catch (InterruptedException e){}
		//TRYING TO TAKE THE FORK SECOND TIME
		
		System.out.println(name+" Starving ===========================");
		if (out!=null){
        	out.println("Starving");
		}
		fork.take(this);
		if (out!=null){
        	out.println("Taking fork Second Time");
		}
	  
        	 try {
   			  System.out.println(name+" Eating Second Time ");
   		      sleep((int)(Math.random()*50));
               } catch (InterruptedException e){}
   		  if (out!=null){
   	        	out.println("Eating Second Time");
   		  }
	     	try {
	         		sleep((int)(Math.random()*1000));
	     	} catch (InterruptedException e){}
	     	
	     	System.out.println(name+" Stop dining Second Time");
	     	if (out!=null){
	        	out.println("Stop dining second time");
	     	}
	     	fork.pose();
	     	System.out.println(name+" Poses the fork Second Time");
	     	if (out!=null){
	        	out.println("Poses the fork Second Time");
	     	}
	     	
	
	     System.out.println(name+" Thinking Second Time");
	     	if (out!=null){
	        	out.println("Thinking Second Time");
	     	}
	       	
	}
public String toString(){
		return name;
	}
}