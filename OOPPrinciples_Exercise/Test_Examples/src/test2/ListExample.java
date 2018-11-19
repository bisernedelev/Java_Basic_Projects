/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test2;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListExample {
    
    static List<Character> getLinkedList(){
        List<Character> list = new LinkedList<>();
        
        list.add('a');
        list.add('b');
        list.add('c');
        list.add('d');
        list.add('e');
        list.add('f');
        
        return list;
    }
    
    static List<Character> getArrayList(){
        List<Character> arrayList = new ArrayList<>();
        
        arrayList.add('a');
        arrayList.add('b');
        arrayList.add('c');
        arrayList.add('d');
        arrayList.add('e');
        arrayList.add('f');
        
        return arrayList;
    }
    
    public static void main(String[] args){
        List<Character> linkedList = getLinkedList();
        List<Character> arrayList = getArrayList();
        
        int a, b;
        
        // Retrieving element by the index is slower for linked list
        // and faster for array list. Array list has direct access since
        // it is an array. Linked list has to traverse elements and count.
        a = linkedList.get(5); 
        b = arrayList.get(5); 
        
        // Inserting element is faster in linked list, because only references
        // are changed. Element with index 3 get its next element reference
        // replaced with the new element and the new element has its next element
        // reference set up with the former element with index 4.
        // In the case of an array list, all elements from 4 onwards have to be
        // shifted 1 position to the right.
        linkedList.add(4, 'z');
        arrayList.add(4, 'z');
        
        
        // Index of has the same running time in both implementations. Both
        // need to find by traversing so running time is O(N)
        a = linkedList.indexOf('a');
        b = arrayList.indexOf('z');
        
        printList(linkedList);
        printList(arrayList);
    }

    private static void printList(List<Character> list) {
        for(Character i : list){
            System.out.print(i + " ");
        }
        
        System.out.println();
    }}