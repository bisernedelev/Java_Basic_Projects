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
public class Task3a_PrintMinAndMax {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = 0;
        int max = 1;
        int min = 0;

        for (int i = 0; i < a; i++) {
            b = sc.nextInt();
            if (b <= min) {
               min=b;
            } else {
                max=b;
            }

        }
        System.out.println(min);
        System.out.println(max);
        
    }

}
