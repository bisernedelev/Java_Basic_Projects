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
public class Task1c_ReadArray {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
       int b[]=new int[a];
        for (int i = 0; i < a; i++) {
            b[i]=sc.nextInt();
        }
        for (int i = 0; i < b.length; i++) {
             System.out.print(b[i]+",");
             System.out.println("1");
        }
    }
}
