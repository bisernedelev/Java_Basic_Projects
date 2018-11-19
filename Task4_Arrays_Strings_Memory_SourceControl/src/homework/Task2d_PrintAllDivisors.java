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
public class Task2d_PrintAllDivisors {
    public static void main(String[] args) {
        
          Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
       int b = 0;

        for (int i = 1; i <=a; i++) {

            if (a % i == 0) {
             b++;
            }
         }
        if (b==2) {
            System.out.println("TRUE");
        }else
        {
            System.out.println("FALSE");
        }
    }
    
}

