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
public class Task5b_PrintCountOfWords {

    public static void main(String[] args) {

        String s = "The last word is not a w0rd.";
        char[] ch = s.toCharArray();
        int wordCount = 0;
        for (char c : ch) {

            if (('a' == c || 'e' == c || 'o' == c || 'u' == c || 'i' == c || 'y' == c) && ' ' == c) {

                wordCount++;
            }

        }
        System.out.println(wordCount);
    }
}
