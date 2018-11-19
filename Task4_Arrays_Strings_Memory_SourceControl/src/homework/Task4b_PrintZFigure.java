/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package homework;

import java.util.Scanner;

/**
 *
 * @author biserPC
 */
public class Task4b_PrintZFigure {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        
    for (int i = 0; i < m;i++) {
        for (int j = 0; j < m; j++) {
            if (i == 0 || i == m - 1 || j ==m - 1 - i) {
                System.out.print("*");
            } else {
                System.out.print(" ");
            }
        }
        System.out.println();
    }
 } 
}
