/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package homeworkjavatask2_classes;

/**
 *
 * @author biserPC
 */
public class Person {

    String name;
    int age;

    Person() {
        name = "NoName";
        age = -1;
    }

    Person(String newName) {

        name = newName;
        age = -1;
    }

    Person(String newName, int newAge) {
        name = newName;

        if (newAge >= 0 || newAge >= 150) {
            age = newAge;
        } else {
            //  System.out.println("ERROR23");
            age = -1;
        }
    }

    String getDescription() {
        if (age == -1 && !"NoName".equals(name)) {
            System.out.println("Hello , I am " + name);
        } else if ("NoName".equals(name) && age == -1) {
            System.out.println("Hello , I am John Doe");
        } else if (age > 150 && !"NoName".equals(name)) {
            System.out.println("ERROR");
        } else {
            System.out.println("Hello , I am " + name + "I am " + age + " years old.");
        }
        return null;
    }
}
