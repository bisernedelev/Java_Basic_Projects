package Gen;


public class Person {

    String name;
    String egn;

    public Person(String name, String egn) {
        this.name = name;
        this.egn = egn;
    }

    @Override
    public boolean equals(Object obj) {

        if (obj.getClass() == this.getClass()) {

            Person other = (Person) obj;

            if (this.egn.equals(other.egn) && this.name.equals(other.name)) {
                return true;
            }
        }

        return false;
    }

}
