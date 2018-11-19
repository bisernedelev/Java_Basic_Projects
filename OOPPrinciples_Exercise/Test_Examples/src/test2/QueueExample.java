/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test2;

/**
 *
 * @author biserPC
 */
import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.Queue;

public class QueueExample {

    public static void main(String[] args) {

        Queue<Integer> deck = new ArrayDeque<>();
        Queue<Integer> list = new LinkedList<>();
        
        for (int i = 1; i <= 10; i++) {
            deck.add(i);
            list.add(10 + i);
        }
        
        for (int i = 0; i < 4; i++) {
            System.out.print(deck.poll() + " ");
            list.poll();
        }
        
        System.out.print("pause ");
        
        while(!list.isEmpty()){
            System.out.print(list.poll() + " ");
        }
    }
}