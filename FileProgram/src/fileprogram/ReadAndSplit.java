/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fileprogram;

import java.awt.Desktop;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 *
 * @author biserPC
 */
public class ReadAndSplit {

    private void resetTheConsole(String inputConsolePath) throws IOException {
        FileOutputStream writer = null;
        try {
            writer = new FileOutputStream(inputConsolePath);
            writer.write(("Write here").getBytes());
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            writer.close();
        }
    }

    public void readAndSplit(CreateAndOpen ex) throws IOException {

        while (true) {

            @SuppressWarnings("resource")
            String consolePath = "C:\\Users\\biserPC\\Desktop\\Command.txt";
            Scanner scanner = new Scanner(new File("C:\\Users\\biserPC\\Desktop\\Command.txt"));
            String content = scanner.useDelimiter("\\Z").next();

            if (content.contains("#") && content.contains("@")) {
                String[] text = content.split("#");
                String[] path = text[1].split("@");

                String s;

                s = path[1];

                if (path[0].equals("create")) {
                    s = path[1];

                    File file = null;
                    file = new File(s);
                    if (!file.exists()) {

                        if (!file.exists()) {
                            PrintWriter writer1 = null;

                            try {

                                file.createNewFile();
                                writer1 = new PrintWriter(file);
                                writer1.println(text[0]);
                                System.out.println("CREATED");
                                writer1.close();
                                CreateAndOpen ex1CreateAndOpen = new CreateAndOpen();
                                ex.notepad.destroy();
                                resetTheConsole(consolePath);
                                ex1CreateAndOpen.runNotePad(consolePath);
                            } catch (Exception e) {

                            }

                        }
                    } else {
                        CreateAndOpen ex1CreateAndOpen = new CreateAndOpen();
                        ex.notepad.destroy();
                        System.out.println("File already excist");
                        resetTheConsole(consolePath);
                        ex1CreateAndOpen.runNotePad(consolePath);

                    }
                } else if (path[0].equals("delete")) {

                    s = path[1];
                    File file = null;
                    file = new File(s);
                    if (file.exists()) {
                        file.delete();
                        System.out.println("DELETED");
                        resetTheConsole(consolePath);

                    } else {

                        System.out.println("File doesn't exist");
                        resetTheConsole(consolePath);

                    }
                } else if (path[0].equals("open")) {

                    s = path[1];
                    File file = null;
                    file = new File(s);

                    Desktop desktop = Desktop.getDesktop();
                 
                    if (file.exists()) {

                        desktop.open(file);

                        System.out.println("Opened");
                        resetTheConsole(consolePath);

                    } else {

                        System.out.println("Can't open the file");
                        resetTheConsole(consolePath);

                    }
                } else if (path[0].equals("save")) {

                    s = path[1];
                    File file = null;
                    file = new File(s);

                    PrintWriter writer1 = null;
                    if (file.exists()) {

                        file.createNewFile();
                        writer1 = new PrintWriter(file);
                        writer1.println(text[0]);
                        System.out.println("Saved");
                        writer1.close();
                        resetTheConsole(consolePath);
                    } else {
                        System.out.println("Can't save");
                        resetTheConsole(consolePath);

                    }
                }
            }
        }
    }
}
