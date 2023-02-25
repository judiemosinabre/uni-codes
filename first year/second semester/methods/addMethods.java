package methods;

import java.util.Scanner;
public class addMethods {
    
    public static void main(String[] args) {
        int num1 = 1, num2 = 2;
        String text1 = "one", text2 = "two";
        
        
        add(num1,num2);
        add(text1,text2);
    }
    
    public static void add(int num1, int num2) {
        int sum = num1 + num2;
        System.out.println("Sum is: " + sum);
    }
    
    public static void add(String text1, String text2) {
        System.out.println("Text is: " + text1 + " " + text2);
    }
}
