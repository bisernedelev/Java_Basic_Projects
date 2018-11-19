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
public class Task1c_ReadAge {
    public static void main(String[] args) {
        
        Scanner sc= new Scanner(System.in);
        int age = sc.nextInt();
        if (age>=18){
            System.out.println("TRUE");
        }
        else if(age<18 && age>=0){
            System.out.println("FALSE");
        }
        else {
            System.out.println("ERROR");
        }
    }
}
