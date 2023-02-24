
package conditionalstatements;

import java.util.Scanner;
public class IntegerIdentifier {

   
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        
        System.out.print("Enter the number: ");
        int num = input.nextInt();
        
        if(num > 0) {
            System.out.println(num + " is a Positive number");
        }
        
        else if (num < 0) {
            System.out.println(num + " is a Negative number");
        }
        else if (num == 0) {
            System.out.println(num + " is zero");
        }
        else {
            System.out.println("INVALID");
        }
    }
    
}
