/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test2;

/**
 *
 * @author biserPC
 */
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetExample {

    public static void main(String[] args) {

        // for any set, the contains and add/remove methods are fast
        Set<Integer> sortedSet = new TreeSet<>();
        Set<Integer> unorderedSet = new HashSet<>();
        Set<Integer> orderedSet = new LinkedHashSet<>();

        Integer[] numbers = {5, 7, 8, 1, 2, 3, 9, 11, -2, -5, 10};

        sortedSet.addAll(Arrays.asList(numbers));
        unorderedSet.addAll(Arrays.asList(numbers));
        orderedSet.addAll(Arrays.asList(numbers));

        printSet(sortedSet);
        printSet(unorderedSet);
        printSet(orderedSet);
    }

    private static void printSet(Set<Integer> set) {
        System.out.println(set.getClass().toString());

        for (Integer i : set) {
            System.out.print(i + " ");
        }

        System.out.println();
    }
}