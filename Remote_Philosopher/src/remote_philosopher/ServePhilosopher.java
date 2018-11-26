import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;

public class ServePhilosopher extends Thread {

     private Socket socket;
	 private BufferedReader in;
	 private PrintWriter out;
	 private Fork fk;
	 private String name="";
	
	 
	 public ServePhilosopher(Socket s ,Fork fk) throws IOException{
		 socket =s;
		 in = new BufferedReader(
	                new InputStreamReader(
	                  socket.getInputStream())); 
		 out =   new PrintWriter(
	                new BufferedWriter(  new OutputStreamWriter(
	                        socket.getOutputStream())),true);
		 this.fk=fk;
		 start();
	 }
	 public void run(){
		
		 int n = 0;
		 try {
			name = in.readLine();
			(new Philosopher(name,fk,out)).start();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 
		 
	
	 }
	
}
