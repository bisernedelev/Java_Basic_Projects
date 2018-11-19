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
public class Task2f_PrintMirrorNumber {
    public static void main(String[] args) {
        
           Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
         String draft ="";
        
        while (n!=0) {
            draft = draft +n%10;
            n/=10;
        }

       System.out.println(draft);
    }
}
