package scanner;

import java.util.Scanner;
public class ScannerAreaOfTriangle {
    
    public static void main(String[] args) {
        //initial display
        System.out.println("Area of a Triangle Calculator");
        
        Scanner input = new Scanner (System.in);
        //print = display
        System.out.print("Type the base: ");
        Double base = input.nextDouble();
        
        System.out.print("Type the height: ");
        Double height = input.nextDouble();
        
        Double area;
        area = base * height/2;
        System.out.println(area);
    }
}
