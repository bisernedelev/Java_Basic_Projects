/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package task1_peoplepresentation;

import java.util.Scanner;

/**
 *
 * @author biserPC
 */
public class Task1_PeoplePresentation {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        String firstName;
        String lastName;
        int facultyNumber;
        int lectureCount;
        int exerciseCount;
        double weekSalary;
        float workHoursPerDay;

        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            String line = sc.nextLine();
            String[] split = line.split(" ");

            switch (split.length) {
                case 5:

                    firstName = split[0];
                    lastName = split[1];
                    facultyNumber = Integer.parseInt(split[2]);
                    lectureCount = Integer.parseInt(split[3]);
                    exerciseCount = Integer.parseInt(split[4]);

                    Student stud = new Student(firstName, lastName, facultyNumber, lectureCount, exerciseCount);
                    if (stud.getFirstName() != null) {
                        System.out.println();
                        System.out.printf("First name:%s\n Last name:%s\nOccupation:%s\n Faculty number:%d\n Hours per day:%.2f",
                                firstName, lastName, stud.getOccupation(), facultyNumber, stud.getHoursPerDay(lectureCount, exerciseCount));
                         System.out.println();
                        break;
                    } else {
                        return;
                    }

                case 4:
                    firstName = split[0];
                    lastName = split[1];
                    weekSalary = Double.parseDouble(split[2]);
                    workHoursPerDay = Float.parseFloat(split[3]);

                    Worker work = new Worker(firstName, lastName, weekSalary, workHoursPerDay);
                    if (work.getFirstName() != null) {
                         System.out.println();
                        System.out.printf("First name:%s\n Last name:%s\nOccupation:" + work.getOccupation() +
                                "\n WeekSalary:%.2f\nHours Per Day:%f\nSalary per Hour:%.2f\n "
                                , firstName, lastName, weekSalary, workHoursPerDay,work.getSalaryPerHour());
                        System.out.println();
                        break;
                    } else {
                        return;
                    }

                default:
                    System.out.println("ERROR");
                    break;
            }

        }

    }

}
