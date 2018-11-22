/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package threads_swimming_pool;

/**
 *
 * @author biserPC
 */
import java.io.*;
import java.net.*;

public class Server extends Thread {

    private static final int PORT = 8080;
    private ServerSocket s = null;
    private Cabine c;
    String name;

    Server(Cabine c) {
        this.c = c;
    }

    public void run() {
        try {
            s = new ServerSocket(PORT);
            System.out.println("Server Started");

            while (true) {
                // Blocks until a connection occurs:
                Socket socket = s.accept();
                try {
                    PrintWriter out = null;
                    new ServeClient(socket, c);
                } catch (IOException e) {
                    // If it fails, close the socket,
                    // otherwise the thread will close it:
                    socket.close();
                }
            }
        } catch (Exception ioe) {
        }
        try {
            s.close();

        } catch (Exception ioe) {
        }

    }
}
