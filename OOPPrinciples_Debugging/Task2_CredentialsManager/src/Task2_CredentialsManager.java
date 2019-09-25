
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author biserPC
 */
public class Task2_CredentialsManager {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        
        String command;
        String username;
        String password;
        String newPassword = null;

        Credentials[] crMassive = new Credentials[20];

        for (int i = 0; i < crMassive.length; i++) {
            String line = sc.nextLine();
            String[] split = line.split(" ");

            command = split[0].trim();
            if (!command.equals("END")) {

                username = split[1].trim();
                password = split[2].trim();

                if (command.equals("CHPASS")) {
                    newPassword = split[3].trim();
                }
                System.out.println();
                switch (command) {
                    case "ENROLL":
                        crMassive[i] = new Credentials(username, password);
                        System.out.printf("%s Success", command);
                        System.out.println();
                        break;
                    case "AUTH":
                        for (int j = 0; j < crMassive.length; j++) {
                            if((crMassive[j].getPassword())==split[2]) {
                               System.out.printf("%s Success", command);
                             }else{
                                System.out.println("ERROR AUTH");
                            }
                        }

                        break;
                    case "CHPASS":
                        crMassive[i] = new Credentials(username, password, newPassword);
                        if (split[2] != split[3]) {

                            crMassive[i - 1].changePassword(newPassword);
                        } else {
                            System.out.println("ERROR!!!");

                        }

                        System.out.printf("%s Success", command);
                        System.out.println();
                        break;
                    default:
                        System.out.println("Invalid command!!!");

                }

            } else {
                return;
            }
        }

    }
}
