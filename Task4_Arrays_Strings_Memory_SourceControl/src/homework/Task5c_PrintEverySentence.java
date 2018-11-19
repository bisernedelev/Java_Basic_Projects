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
public class Task5c_PrintEverySentence {
    public static void main(String[] args) {
        
        String s = "Peter loves dogs. He doesn’t like cats. Maria likes\n" +
"cats";
        
        String s1[] = s.split(".");
        for (String s11 : s1) {
            System.out.println(s1[1].toString());
        }
          
    }
}
