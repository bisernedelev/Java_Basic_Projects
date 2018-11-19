package Gen;


public class GenericMethodsExample {

    public static <T> int countOccurances(T[] arr, T elementToSearch) {

        int count = 0;

        if (elementToSearch == null) {
            for (T element : arr) {
                if (element == null) {
                    count++;
                }
            }
        } else {
            for (T element : arr) {
                if (element != null) {
                    if (element.equals(elementToSearch)) {
                        count++;
                    }
                }
            }
        }

        return count;
    }

    public static void main(String[] args) {

        Person a = new Person("Gosho", "127367213");
        Person b = new Person("Pesho", "812391121");
        Person c = new Person("Pesho", "812391121");

        Person[] arr = {a, b, c, c};

        System.out.println(countOccurances(arr, c));
    }

}
