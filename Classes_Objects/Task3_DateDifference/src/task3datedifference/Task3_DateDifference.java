/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package task3datedifference;

import java.util.Scanner;

/**
 *
 * @author biserPC
 */
public class Task3_DateDifference {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter first year,month and date:");
        int year1 = sc.nextInt();
        int month1 =sc.nextInt();
        int date1=sc.nextInt();
        
        System.out.println("Enter second year,month and date:");
        int year2 = sc.nextInt();
        int month2 =sc.nextInt();
        int date2=sc.nextInt();
        
        SwiftDate sw = new SwiftDate(year1, month1,date1);
       SwiftDate sw2 = new SwiftDate(year2, month2, date2);
        
      int daysDifference =sw.getDaysDifference() - sw2.getDaysDifference();
        if (daysDifference<0) {
            daysDifference=-daysDifference;
        }
          System.out.println();
        System.out.println("Days difference is: "+ daysDifference);
        
        sw.getInfo();
        sw.isLeapYear();
        sw.getCentury();
        
        System.out.println();
        
        sw2.getInfo();
        sw2.isLeapYear();
        sw2.getCentury();
        
        
    }
}
