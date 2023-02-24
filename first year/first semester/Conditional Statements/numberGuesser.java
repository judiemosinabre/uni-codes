package conditionalstatements;

import java.util.Scanner;
public class numberGuesser {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.print("Enter a number: ");
        int num = input.nextInt();
        
        if (num < 100 && num < 50) {
            System.out.println("The entered number is less than 100");
        }
        else if (num < 100 && num > 50) {
            System.out.println("The entered number is less than 100");
            System.out.println("The entered number is greater than 50");
        }
        else if (num > 100 && num > 50) {
            System.out.println("The entered number is greater than 100");
        }
        
        else {
            System.out.println("STOP");
        }
    }
    
}
