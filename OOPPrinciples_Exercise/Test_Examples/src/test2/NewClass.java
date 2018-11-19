/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test2;

import java.util.Stack;

/**
 *
 * @author biserPC
 */
public class NewClass {
    public static void main(String[] args) {
        
        String str="5(2(10(9]))))";
         if (str.charAt(0) == '{')
            System.out.println("errr");

    Stack<Character> stack = new Stack<Character>();

    char c;
    for(int i=0; i < str.length(); i++) {
        c = str.charAt(i);

        if(c == '(')
            stack.push(c);
        else if(c == '{')
            stack.push(c);
        else if(c == ')')
            if(stack.empty())
                System.out.println("errr1");
            
            else if(stack.peek() == '(')
                stack.pop();
            else
               System.out.println("errr2");
        else if(c == '}')
            if(stack.empty())
              System.out.println("errr3");
            else if(stack.peek() == '{')
                stack.pop();
            else
              System.out.println("errr4");
    }
    System.out.println("true");
    }
}
