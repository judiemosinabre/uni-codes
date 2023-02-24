package conditionalstatements;

import java.util.Scanner;
public class gradeEquivalentLetter {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.println("Enter your numeric test score: ");
        int score = input.nextInt();
        
        if (score >= 90) {
            System.out.println("Your grade is A");
        }
        
        else if (score >= 80 && score < 90) {
            System.out.println("Your grade is B");
        }
        
        else if (score >= 70 && score < 80) {
            System.out.println("Your grade is C");
        }
        
        else if (score >= 50 && score < 70) {
            System.out.println("Your grade is D");
        }
        else if (score >= 49 && score < 50) {
            System.out.println("Your grade is F");
        }
        
        else{
            System.out.println("STOP");
        }
    }
}
