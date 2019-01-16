/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fileprogram;

import java.io.IOException;

/**
 *
 * @author biserPC
 */
public class FIleProgramMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
                   CreateAndOpen ex = new CreateAndOpen();
		   ex.createAndOpen();
		   ReadAndSplit ex2 = new ReadAndSplit();
		   ex2.readAndSplit(ex);
		  //!!
    }
    
}
