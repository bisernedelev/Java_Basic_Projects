/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package removeduplicates;

import java.util.Scanner;

/**
 *
 * @author biserPC
 */
public class RemoveDuplicates {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
        String[] array1 = line.split(",");
        String[] array = new String[array1.length];
        boolean found = false;
        String[] array2 = new String[array1.length];
        String[] arrayChar = new String[array1.length];
        int a1 = 0;
        int idx = 0;
        int idx2 = 0;
        int idxUnique = 0;
        int qq = 0;


        String[] unique = new String[array1.length];


        for (int i = 0; i < array1.length; i++) {
            array[i] = array1[i];

        }
        String current = array[0];
        for (int i = 0; i < array.length; i++) {
            if (current.equals(array[i]) && !found) {
                found = true;
            } else if (!current.equals(array[i])) {
                array2[i] = current;
                current = array[i];
                found = false;
            }
        }

        if (current.matches("[-+]?\\d*\\.?\\d+")) {
            for (int j = 0; j < array2.length; j++) {
                if (array2[j] != null)
                    System.out.print(array2[j] + ",");
            }

            System.out.println(current);
        } else {

            for (int a = 0; a < array2.length; a++) {
                if (array2[a] != null) {
                    arrayChar[a1] = array2[a];
                    a1++;
                }
            }
            for (int b = 0; b < arrayChar.length; b++) {
                if (arrayChar[b] != null) {
                    idx++;
                }
            }
            String[] arrayCharsorted = new String[idx];
            for (int c = 0; c < arrayCharsorted.length; c++) {
                if (arrayChar[c] != null) {
                    arrayCharsorted[idx2] = arrayChar[c];
                    idx2++;
                }
            }


            for (int e = 1; e < arrayCharsorted.length; e++) {
                unique[0] = arrayCharsorted[0];
                boolean uniqueBool = false;
                for (int f = 0; f < arrayCharsorted.length; f++) {
                    if (!arrayCharsorted[e].equals(arrayCharsorted[f])) {
                        for (int g = 0; g < arrayCharsorted.length; g++) {
                            if (unique[g] == null) {
                                //  break;
                            } else if (!unique[g].equals(arrayCharsorted[e])) {
                                uniqueBool = true;
                            } else if (unique[g].equals(arrayCharsorted[e])) {
                                uniqueBool = false;
                                break;
                            }

                        }
                        if (uniqueBool) {
                            unique[e] = arrayCharsorted[e];
                        }

                    }
                }

            }

            for (int zz = 0; zz < unique.length; zz++) {
                if (unique[zz] != null) {
                    idxUnique++;
                }
            }

            String[] uniquePrint = new String[idxUnique];

            for (int q = 0; q < unique.length; q++) {

                if (unique[q] != null) {
                    uniquePrint[qq] = unique[q];
                    qq++;

                }

            }
            for (int q2 = 0; q2 < uniquePrint.length - 1; q2++) {
                System.out.print(uniquePrint[q2] + ",");
            }
            System.out.println(uniquePrint[uniquePrint.length - 1]);
        }

    }
    
}
