
package scanner;

import java.util.Scanner;
public class GradesCalculator {
    
    public static void main(String[] args) {
      //initial display
      System.out.println("Average Grade of a Student in 5 subjects");
      
      Scanner scan = new Scanner(System.in);
      System.out.print("Subject 1: ");
      Double sub1 = scan.nextDouble();
      
      System.out.print("Subject 2: ");
      Double sub2 = scan.nextDouble();
      
      System.out.print("Subject 3: ");
      Double sub3 = scan.nextDouble();
      
      System.out.print("Subject 4: ");
      Double sub4 = scan.nextDouble();
      
      System.out.print("Subject 5: ");
      Double sub5 = scan.nextDouble();
      
      Double avg1;
      avg1 = (sub1 + sub2 + sub3 + sub4 + sub5)/5;
      System.out.println(avg1);
    }
        
}
