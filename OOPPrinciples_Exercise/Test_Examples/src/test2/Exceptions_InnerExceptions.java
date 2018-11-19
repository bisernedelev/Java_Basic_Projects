package test2;


public class Exceptions_InnerExceptions {

    public static void main(String[] args) throws CalculationException {

        // should pass an array with 6 elements
        Student s = new Student(new double[]{2, 3, 4, 5, 6});

        s.getAverageGrade();

    }
}
