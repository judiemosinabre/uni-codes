package methods;

import java.util.Scanner;
public class Methods {

    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scan.nextInt();
        
        Checker(num); 
    }
    
    public static void Checker(int num) {
        if (num % 2 == 0) {
            System.out.println(num + " is even");
        }
        else if (num == 0) {
            System.out.println(num + " is zero");
        }
        else {
            System.out.println(num + " is odd");
        }
    }
    
}
