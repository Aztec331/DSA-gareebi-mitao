import java.util.*;

public class array11_2darray{
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int m = scan.nextInt();
        int arr[][]= new int[n][m];

        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr.length; j++){
                arr[i][j]= scan.nextInt();
            }
        }

        System.out.println();
        
        //for printing the elements
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr.length; j++){
                System.out.print(arr[i][j]+ " ");
            }
            System.out.println();
        }

    }

}