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
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;

public class ServeClient extends Thread {

    private Socket socket;
    private BufferedReader in;
    private PrintWriter out;
    private Cabine c;
    private String name = "";

    public ServeClient(Socket s, Cabine c) throws IOException {
        socket = s;
        in = new BufferedReader(
                new InputStreamReader(
                        socket.getInputStream()));
        out = new PrintWriter(
                new BufferedWriter(new OutputStreamWriter(
                        socket.getOutputStream())), true);
        this.c = c;
        start();
    }

    public void run() {

        int n = 0;
        try {
            name = in.readLine();
            (new Client(c, name, n, out)).start();

        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }

}
