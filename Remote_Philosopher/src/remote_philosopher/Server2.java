import java.io.*;
import java.net.*;
public class Server2 extends Thread{
    private static final int PORT = 8080;
    private ServerSocket s=null;
    private Fork fk;
    String name;
    Server2(Fork fk){
        this.fk=fk;
    }
    
    public void run(){
        try {
            s = new ServerSocket(PORT);
            System.out.println("Server Started");

            while(true) {
                // Blocks until a connection occurs:
                Socket socket = s.accept();
                try {
                    PrintWriter out = null;
					new ServePhilosopher(socket,fk);
                } catch(IOException e) {
                    // If it fails, close the socket,
                    // otherwise the thread will close it:
                    socket.close();
                }
            }
        }
        catch(Exception ioe){}
        try {
           s.close();
           
        }
        catch(Exception ioe){}   
        
    }
}