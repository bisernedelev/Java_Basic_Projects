/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package task1_peoplepresentation;

/**
 *
 * @author biserPC
 */
public class Worker extends Person {

    double weekSalary;
    float workHoursPerDay;
    double gSp;

    Worker(String firstName, String lastName, double weekSalary, float workHoursPerDay) {

        super(firstName, lastName);
        this.weekSalary = weekSalary;
        this.workHoursPerDay = workHoursPerDay;

    }

    String getOccupation() {

        return "Worker";
    }
    
    double getSalaryPerHour(){
    gSp = weekSalary/(workHoursPerDay*5);
    return gSp;
    
    }

    public double getWeekSalary() {
        return weekSalary;
    }

    public void setWeekSalary(double weekSalary) {
        this.weekSalary = weekSalary;
    }

    public float getWorkHoursPerDay() {
        return workHoursPerDay;
    }

    public void setWorkHoursPerDay(int workHoursPerDay) {
        this.workHoursPerDay = workHoursPerDay;
    }

}
