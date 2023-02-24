
package conditionalstatements;

import java.util.Scanner;
public class departmentYear {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.println("Enter the dept: ");
        String dept = input.nextLine();
        System.out.println("Enter a year: ");
        int year = input.nextInt();
        
        if (dept.equals ("CIT")) {
            System.out.println("The student is in the Computer Science department");
            switch (year) {
                case 1:
                    System.out.println("The student is in 1st year");
                    break;
                case 2:
                    System.out.println("The student is in 2nd year");
                    break;
                case 3:
                    System.out.println("The student is in 3rd year");
                    break;                   
                case 4:
                    System.out.println("The student is in 4th year");
                    break;
                default:
                    break;
            }
        }
            
        else if (dept.equals ("EEE")) {
            System.out.println("The student is in the Electrical and Electronics department");
            switch (year) {
                case 1:
                    System.out.println("The student is in 1st year");
                    break;
                case 2:
                    System.out.println("The student is in 2nd year");
                    break;
                case 3:
                    System.out.println("The student is in 3rd year");
                    break;
                case 4:
                    System.out.println("The student is in 4th year");
                    break;
                default:
                    break;
           }
        }
  
        else if (dept.equals ("ME")) {
            System.out.println("The student is in the Mechanical department");
            switch (year) {
                case 1:
                    System.out.println("The student is in 1st year");
                    break;
                case 2:
                    System.out.println("The student is in 2nd year");
                    break;
                case 3:
                    System.out.println("The student is in 3rd year");
                    break;
                case 4:
                    System.out.println("The student is in 4th year");
                    break;
                
                default:
                    break;
            }   
        }
        else {
            System.out.println("Enter a valid department");
        }
    }
}
