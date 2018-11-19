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
public class Task2b_PrintNonDivisors {
    public static void main(String[] args) {
        
         Scanner sc= new Scanner(System.in);
         int a = sc.nextInt();
         
         for (int i = 1; i <= a; i++) {
           if(i%3!=0&&i%7!=0)  {
               System.out.println(i);
           }
        }
    }
}
