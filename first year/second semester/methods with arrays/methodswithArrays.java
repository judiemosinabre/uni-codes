package methods;

import java.util.Scanner;
public class methodswithArrays {
    public static void main (String[] args) {
        Scanner scan = new Scanner (System.in);
        System.out.print("Enter size: ");
        int size = scan.nextInt();
        int [] array = new int[size];
        
        input(array, size);
        output(array, size);
    }
    
    public static void input (int [] array, int size) {
        Scanner scan = new Scanner (System.in);
        for (int i = 0; i < size; i++) {
            System.out.print("Enter element: ");
            array[i] = scan.nextInt();
        }
        
        output(array, size);
    }
    
    //don't know how to make this one pop on the output window
    public static void output (int [] array, int size) {
        System.out.print("Array elements: ");
        for (int i = 0; i < size; i++) {
            System.out.print(array[i] + " ");
        }
    }
    
}
