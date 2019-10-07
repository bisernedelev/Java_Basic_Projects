/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fileprogram;

import java.io.File;
import java.io.IOException;

/**
 *
 * @author biserPC
 */

public class Delete {
    public void resetConsole() throws IOException{
			
			File file = new File ("C:\\Users\\biserPC\\Desktop\\Command.txt");
			
			if (file.exists()){
				
				file.delete();
				
				if (!file.exists()){
				file.createNewFile();
				}
			}
}
	}
