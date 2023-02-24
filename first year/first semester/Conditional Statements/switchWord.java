
package conditionalstatements;

import java.util.Scanner;
public class switchWord {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.print("Enter a String: ");
        String word = input.nextLine();
        switch (word) {
            case "java":
                System.out.println("Java is the best programming language");
                break;
            case "java string":
                System.out.println("This is an example for Java Switch using String");
                break;
            default:
                System.out.println("Sorry, please enter the different word");
                break;
        }       
    }
}
