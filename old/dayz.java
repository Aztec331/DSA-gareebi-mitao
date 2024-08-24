import java.util.Scanner;

public class dayz {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        
        try {
            System.out.print("Please enter an integer: ");
            int x = scn.nextInt();
            System.out.println("You entered: " + x);
        } catch (java.util.InputMismatchException e) {
            System.out.println("Invalid input. Please enter a valid integer.");
        }
        
        scn.close(); // Don't forget to close the scanner when you're done.
    }
}
