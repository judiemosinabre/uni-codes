package conditionalstatements;

import java.util.Scanner;
public class bloodDonation {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.print("Enter the age: ");
        
        int age = input.nextInt();
        System.out.print("Enter the weight: ");
        
        int weight = input.nextInt();
        if (age >= 18 && weight > 50) {
            System.out.println("You are eligible to donate blood");
        }
        else if (age < 18) {
            System.out.println("Age must be greater than 18");
        }
        else if (age >= 18 && weight < 50) {
            System.out.println("You are not eligible to donate blood");
        }
        else {
            System.out.println("STOP");
        }
    }
}
