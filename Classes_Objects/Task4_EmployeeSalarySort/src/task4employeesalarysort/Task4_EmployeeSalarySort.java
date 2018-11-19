/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package task4employeesalarysort;



import java.util.Scanner;

/**
 *
 * @author biserPC
 */
public class Task4_EmployeeSalarySort {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
         System.out.print("Please enter number of the employees: ");
        int n = sc.nextInt();
         String information;
        Employee[] emp = new Employee[n];
        
        for (int i = 0; i <emp.length; i++) {
            information=sc.next();
            String newEmp[]=information.split(",");
            
            emp[i] = new Employee(newEmp[0], Double.parseDouble(newEmp[1]), newEmp[2], newEmp[3], 
                    Integer.parseInt(newEmp[4]), newEmp[5]);
            
        }
        for (int i = 1; i < n; i++) {
            if (emp[i-1].getSalary()<emp[i].getSalary()) {
                  for (int j = i-1; j >=0; j--) {
                      if (emp[j].getSalary()<emp[j+1].getSalary()) {
                         Employee[] sorted= new Employee[2];
                         sorted[0]=emp[j+1];
                        emp[j+1] = emp[0];
                        emp[j] = sorted[0];  
                    }
                }
                
            }
        }
        for (int o = 0; o < 3; o++) {
                    System.out.printf("%s,%s,%s%n", emp[o].getName(),emp[o].getPosition(),emp[o].getPosition());
                }
    }
}
        
        
  
              
     

