/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package task1_uniquenumbers;

import java.util.HashSet;
import java.util.Scanner;

/**
 *
 * @author biserPC
 */
public class Task1_UniqueNumbers {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        HashSet<Integer> ar = new HashSet<>();
        for (int i = 0; i < n; i++) {
            int m = sc.nextInt();
            ar.add(m);
        }
        System.out.println(ar);

    }

}
