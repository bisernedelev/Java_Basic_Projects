/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fileprogram;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;

/**
 *
 * @author biserPC
 */
public class CreateAndOpen {

    protected ProcessBuilder pb;
    protected Process notepad;

    public Process getNotepad() {
        return notepad;
    }

    public void runNotePad(String consolePath) throws IOException {
        pb = new ProcessBuilder();
        pb.command("Notepad.exe", consolePath);
        notepad = pb.start();
    }

    public void createAndOpen() throws IOException {

        String consolePath = "C:\\Users\\biserPC\\Desktop\\Command.txt";
        File file = new File(consolePath);

        if (!file.exists()) {

            try {

                file.createNewFile();

                PrintWriter writer1 = new PrintWriter(file);
                writer1.println("Write Here");
                runNotePad(consolePath);
                writer1.close();

            } catch (IOException e) {

                System.out.println("Cannot create file");

            }
        } else {

            System.out.println("Exist");
            runNotePad(consolePath);

        }
    }
}
