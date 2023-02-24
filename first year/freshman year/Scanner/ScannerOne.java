
package scanner;
import java.util.Scanner;

public class ScannerOne {


    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.print("When is your birthday? ");
        String bday = input.nextLine();
        
        
        System.out.println("Your birthday is on: " + bday);
    }
    
}
