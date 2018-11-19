/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package task2_commonsubset;

import java.util.HashSet;
import java.util.Scanner;

/**
 *
 * @author biserPC
 */
public class Task2_CommonSubset {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();
        HashSet<Integer> set1 = new HashSet<>();
        HashSet<Integer> set2 = new HashSet<>();

        for (int i = 0; i < n; i++) {
            int n1 = sc.nextInt();
            set1.add(n1);
        }
        for (int i = 0; i < m; i++) {
            int n2 = sc.nextInt();
            set2.add(n2);
        }
        set1.retainAll(set2);

        if (set1.isEmpty()) {
            System.out.println("NO");
        } else {
            System.out.println(set1);
        }

    }

}
