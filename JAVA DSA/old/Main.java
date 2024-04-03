import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        if (n >= 18) {
            System.out.println("eligible");
        } else {
            System.out.println("not eligible");
        }

        scanner.close();
    }
}
