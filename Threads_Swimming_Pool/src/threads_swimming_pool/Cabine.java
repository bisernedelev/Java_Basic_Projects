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
public class Cabine {

    private int free;

    Cabine(int free) {
        this.free = free;
    }

    synchronized public void takeCabine() {
        while (free == 0) {
            System.out.println("there is no free cabine, " + Thread.currentThread().getName() + " waiting");
            try {
                wait();
            } catch (InterruptedException e) {
                System.err.println(e);
            }
        }
        free--;
        System.out.println("the cabine is taken by " + Thread.currentThread().getName() + ", there is " + free + " free cabines");
    }

    synchronized public void releaseCabine() {
        free++;
        System.out.println("the cabine is released by " + Thread.currentThread().getName() + ", there is " + free + " free cabines");
        notifyAll();
    }
}
