/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package homework;

import java.util.Arrays;

/**
 *
 * @author biserPC
 */
public class Task1e_Print2dArray {

    public static void main(String[] args) {
        int[][] arr = new int[4][4];
        int inc = 1;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                arr[i][j] = inc;
                inc++;

            }
        }
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(arr[i][j] + " ");

            }

           System.out.println();

        }

    }
}
