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
public class Student extends Person {

    int facultyNumber;
    int lectureCount;
    int exerciseCount;
    float hPd;
    Student(String firstName, String lastName, int facultyNumber, int lectureCount, int exerciseCount) {

        super(firstName, lastName);
        this.facultyNumber = facultyNumber;
        this.lectureCount = lectureCount;
        this.exerciseCount = exerciseCount;

    }

    String getOccupation() {

        return "Student";
    }

   public double getHoursPerDay(int lectureCount, int exerciseCount){
    
    hPd=  (float) ((getLectureCount()*2 + getExerciseCount()*1.5)/5);
    return  hPd;
    
    }
    
    
    
    
    public int getFacultyNumber() {
        return facultyNumber;
    }

    public void setFacultyNumber(int facultyNumber) {
        this.facultyNumber = facultyNumber;
    }

    public int getLectureCount() {
        return lectureCount;
    }

    public void setLectureCount(int lectureCount) {
        this.lectureCount = lectureCount;
    }

    public int getExerciseCount() {
        return exerciseCount;
    }

    public void setExerciseCount(int exerciseCount) {
        this.exerciseCount = exerciseCount;
    }

}
