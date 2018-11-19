/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package homework;

/**
 *
 * @author biserPC
 */
public class Task5a_StringWoVowels {
    public static void main(String[] args) {
        
        String s ="Peter loves dogs";
        
        char[] ch = s.toCharArray();
        for (char c : ch) {
            if (c!='a'&&c!='e'&&c!='i'&&c!='o'&&c!='u'){
            System.out.print(c);
            }
        }
        
    }
}
