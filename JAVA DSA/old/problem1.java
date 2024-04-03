import java.util.Scanner;

public class problem1 {
    public static void main(String[] args){

    Scanner scan = new Scanner(System.in);
    System.out.print("Enter you age:");
    int n = scan.nextInt();

    if (n>=18) {
    System.out.println("eligible");
    } else {
    System.out.println("not eligible");
    }

    scan.close();
    }
}
