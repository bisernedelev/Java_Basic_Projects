import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.Socket;

public class RemPhilosopher {

	private static final int PORT = 8080;
    private static String name;
  
    
	
	public static void main(String[] args) throws IOException {
		String server = null;
        InetAddress addr =  InetAddress.getByName(server);
        System.out.println("addr = " + addr);
        Socket socket = new Socket(addr, PORT); 
        
        try{
        	
        	
        	System.out.println("socket = " + socket);
            BufferedReader in =
                    new BufferedReader(
                            new InputStreamReader(socket.getInputStream()));
            BufferedReader sin =  new BufferedReader(
                    new InputStreamReader(System.in));

            // Output is automatically flushed by PrintWriter:
            PrintWriter out =   new PrintWriter(
                    new BufferedWriter(  new OutputStreamWriter(
                    socket.getOutputStream())),true);
           
            
            System.out.print("Your name please:"); 
            name = sin.readLine();
            
            
           
            
            
                out.println(name);
          
                System.out.println(in.readLine());   
                System.out.println(in.readLine()); 
                System.out.println(in.readLine()); 
           
                System.out.println(in.readLine());  
                System.out.println(in.readLine());
                System.out.println(in.readLine());
             
                System.out.println(in.readLine());
                System.out.println(in.readLine());
                System.out.println(in.readLine());
            
                
                System.out.println("END");
                
         }finally{
        	 System.out.println("closing...");
             socket.close();
          }
       }
	}

