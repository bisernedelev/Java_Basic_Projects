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
public abstract class Person {

    String firstName;
    String lastName;

    public Person(String firstName, String lastName) {

        setFirstName(firstName);
        this.lastName = lastName;

    }

    String getFirstName() {

        return this.firstName;
    }

    String getLastName() {
        return this.lastName;
    }

    public String setFirstName(String firstName) {
        if (firstName.length() >=2 && firstName.length() <= 30) {
           return  this.firstName = firstName;
        }else{
            System.out.println("Expected length for <parameter> is between 2 and 30 symbols.");
        return null;
        }
        

    }
}
