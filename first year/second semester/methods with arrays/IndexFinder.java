package methods;

import java.util.Scanner;
public class IndexFinder {
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Enter a text: ");
        String text = scan.nextLine();
        
        System.out.print("Find: ");
        char letter = scan.next().charAt(0);
        
        find(text, letter);

    }
    
    public static void find(String text, char letter){
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == letter) {
                System.out.println(letter + " is at index " + i);
            }
            
        }
            
    }
}
