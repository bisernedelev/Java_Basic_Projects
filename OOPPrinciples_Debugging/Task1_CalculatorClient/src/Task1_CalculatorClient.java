
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
public class Task1_CalculatorClient {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String command;
        for (int i = 0; i < 10; i++) {

            command = sc.next();
            if (!(command.equals("END"))) {
                float a = sc.nextFloat();
                float b = sc.nextFloat();
                Calculator calc = new Calculator(a, b);

                switch (command) {
                    case "SUM":
                        System.out.printf("%.3f", calc.sum(a, b));
                        System.out.println();
                        break;
                    case "SUB":
                        System.out.printf("%.3f", calc.subtract(a, b));
                        System.out.println();
                        break;
                    case "MUL":
                        System.out.printf("%.3f", calc.multiply(a, b));
                        System.out.println();
                        break;
                    case "DIV":
                        System.out.printf("%.3f", calc.divide(a, b));
                        System.out.println();
                        break;
                    case "PER":
                        System.out.printf("%.3f", calc.percentage(a, b));
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
