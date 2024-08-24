import java.util.Scanner;

public class sumoffirstnaturalnums2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

 
        int sum = 0;


        for (int i = 1; i <= n; i++) {
            sum += i;
            }

            System.out.println("The sum of the first " + n + " natural numbers is: " + sum);
        }

        scanner.close();
    }
}
