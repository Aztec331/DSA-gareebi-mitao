import java.util.Scanner;

public class rough2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking input for the number of rows
        System.out.print("Enter the number of rows:");
        int rows = scanner.nextInt();

        // Creating the 2D array
        int[][] array = new int[rows][2]; // Assuming 2 columns in each row

        // Taking input for each element of the 2D array
        System.out.print("Enter the elements of the array (two integers per line):");

        for (int i = 0; i < rows; i++) {
            array[i][0] = scanner.nextInt(); // First integer
            array[i][1] = scanner.nextInt(); // Second integer
        }

        // Printing the 2D array without converting to string
        System.out.println("The entered 2D array is:");

        for (int i = 0; i < rows; i++) {
            System.out.println(array[i][0] + " " + array[i][1]);
        }
    }
}
