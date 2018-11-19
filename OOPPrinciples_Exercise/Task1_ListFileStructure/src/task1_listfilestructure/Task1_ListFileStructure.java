/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package task1_listfilestructure;

import java.io.File;
import java.nio.file.Path;

/**
 *
 * @author biserPC
 */
public class Task1_ListFileStructure {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
       File curDir = new File(".");
        getAllFiles(curDir);
    }
    private static void getAllFiles(File curDir) {

        File[] filesList = curDir.listFiles();
        for(File f : filesList){
            if(f.isDirectory())
                System.out.println(f.getName());
            if(f.isFile()){
                System.out.println(f.getName());
            }
        }
    }
    
}
