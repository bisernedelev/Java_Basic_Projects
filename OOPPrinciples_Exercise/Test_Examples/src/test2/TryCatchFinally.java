
public class TryCatchFinally {

    static void tryAccessIndex(int[] arr, int idx) {

        // added for readability
        System.out.println();

        try {
            arr[idx] = 5;
        } catch (ArrayIndexOutOfBoundsException ex) {
            System.out.println("Type ArrayIndexOutOfBoundsException was caught.");
        } catch (Exception ex) {
            System.out.println("Type Exception was caught.");
        } finally {
            System.out.println("Finally block is always executed.");
        }
    }

    public static void main(String[] args) {
        int[] arr = new int[5];

        // shows that the catch block with the most specific type 
        // declaration will be executed
        //tryAccessIndex(arr, 5);

        arr = null;
        // we force change in exception which would be thrown
        // we show that next most specific exception is the generic type Exception
        tryAccessIndex(arr, 0);

        arr = new int[4];
        // shows that even if no exception occurs the finally block 
        // will be executed
        //tryAccessIndex(arr, 2);
    }
}
