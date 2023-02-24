package scanner;
import java.util.Scanner;

public class ScannerTwo {
    
    public static void main(String[] args) {
        //initial display
        System.out.println("The product of two numbers");
        
        
        Scanner input = new Scanner (System.in);
        System.out.print("Type your first number: ");
        Double num1 = input.nextDouble();
    
        System.out.print("Type your second number: ");
        Double num2 = input.nextDouble();
        Double num3;
    
        num3 = num1 * num2;
        System.out.println("Product = " + num3);
    }
}
