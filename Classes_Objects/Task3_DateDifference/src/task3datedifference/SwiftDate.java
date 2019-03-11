/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package task3datedifference;

/**
 *
 * @author biserPC
 */
public class SwiftDate {

    int year;
    int month;
    int day;

    SwiftDate(int newYear, int newMonth, int newDay) {
        year = newYear;
        if (newYear < 0 || newYear > 3000) {
            System.out.println("Error , please enter a valid year(0-3000)"
                    + "THE RESULT WILL BE INCORRECT");
        }
        month = newMonth;
        if (newMonth <= 0 || newMonth > 12) {
            System.out.println("Error , please enter a valid month(1-12)"
                    + "THE RESULT WILL BE INCORRECT");
        }
        day = newDay;
        if (newDay < 1 || newDay > 31) {
            System.out.println("Error , please enter a valid month(1-31)"
                    + "THE RESULT WILL BE INCORRECT");
        }
        
    }

   String isLeapYear() {

        if ((year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0))) {
            
            System.out.println("It is a LEAP year");
        } else{
            System.out.println("It is not a LEAP year");
        }
        return null;

    }

   void getCentury() {
        for (int i = 0; i < 2; i++) {
            year /= 10;
        }
        year += 1;

        System.out.printf("- %d century", year);
    }

    int getDaysDifference() {

        int sum = (year * 365) + (month * 30) + day;
        return sum;
    }

    String getInfo() {

        System.out.println(year + " " + month + " " + day);
        return null;
    }
}
