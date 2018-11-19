/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package task3_parenthesesmatching;


import java.util.Stack;

/**
 *
 * @author biserPC
 */
public class Task3_ParenthesesMatching {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String str = "[([{}])[](){}([[]]{})]";
        if (str.charAt(0) == '{') {
            System.out.println("errr");
        }

        Stack<Character> stack = new Stack<Character>();

        char c;
        for (int i = 0; i < str.length(); i++) {
            c = str.charAt(i);

            if (c == '(') {
                stack.push(c);
            } else if (c == '{') {
                stack.push(c);
            } else if (c == ')') {
                if (stack.empty()) {
                    System.out.println("False");
                    return;
                } else if (stack.peek() == '(') {
                    stack.pop();
                } else {
                    System.out.println("Falser");
                     return;
                }
            } else if (c == '}') {
                if (stack.empty()) {
                    System.out.println("False");
                     return;
                } else if (stack.peek() == '{') {
                    stack.pop();
                } else {
                    System.out.println("False");
                     return;
                }
            }
        }
        System.out.println("true");
    }

}
