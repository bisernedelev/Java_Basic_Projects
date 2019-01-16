/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package threads_swimming_pool;

import java.io.PrintWriter;

/**
 *
 * @author biserPC
 */
public class Client extends Thread {

    private String name = "";
    int n;
    Cabine c;
    private PrintWriter out;

    Client(Cabine c, String name, int n, PrintWriter out) {

        this.c = c;
        this.out = out;

        if (name == null) {
            name = "Client " + ++n;
        } else {
            name = "\t" + name;
        }
        try {
            System.out.println(" creating new client:" + name);
            sleep((int) (Math.random() * 50));
        } catch (InterruptedException e) {
        }
        super.setName(name);

    }

    public void run() {

        try {
            System.out.println(this + " going to the cabine");
            sleep((int) (Math.random() * 50));
        } catch (InterruptedException e) {
        }
        System.out.println(this + " try to take cabine");
        c.takeCabine();
        if (out != null) {

            out.println("\t" + "taking cabin");
        }

        try {
            System.out.println(this + " changing");
            sleep((int) (Math.random() * 600));
        } catch (InterruptedException e) {
        }
        System.out.println(this + " release cabin");
        c.releaseCabine();
        if (out != null) {

            out.println("\t" + "taking cabin");
        }

        try {
            System.out.println(this + " swiming");
            sleep((int) (Math.random() * 2000));
        } catch (InterruptedException e) {
        }
        System.out.println(this + " try to take cabine");
        c.takeCabine();
        if (out != null) {

            out.println("\t" + "taking cabin");
        }

        try {
            System.out.println(this + " changing");
            sleep((int) (Math.random() * 600));
        } catch (InterruptedException e) {
        }
        System.out.println(this + " release cabin");
        c.releaseCabine();
        if (out != null) {

            out.println("\t" + "taking cabin");
        }

    }

    public String toString() {
        return name;
    }
}
