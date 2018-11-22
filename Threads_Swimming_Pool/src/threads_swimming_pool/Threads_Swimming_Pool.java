/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package threads_swimming_pool;

import java.util.Scanner;

/**
 *
 * @author biserPC
 */
public class Threads_Swimming_Pool {

    private static Scanner sc;

    public static void main(String[] args) {
        sc = new Scanner(System.in);

        Cabine c = new Cabine(3);

        (new Server(c)).start();
        try {
            Thread.sleep(50);
        } catch (InterruptedException e) {
        }

        System.out.println("to start clients input a line");
        sc.nextLine();

        for (int i = 0; i < 6; i++) {
            new Client(c, null, i, null).start();
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
            }

            if ((i % 6) == 0) {
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                }
            }

        }
    }

}
