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
public class Task1d_IsEvenOrOdd {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = a % 2;

        if (b==0) {
            System.out.println("EVEN");
        }
        else{
            System.out.println("ODD");
        }
    }

}
