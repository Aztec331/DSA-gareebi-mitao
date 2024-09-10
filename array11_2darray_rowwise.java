import java.util.*;

public class array11_2darray_rowwise{
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int m = scan.nextInt();
        int arr[][]= new int[n][m];

        //here arr[0].length means row zero's (which is the first row's ) length
        //which will give us how many columns it has
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[0].length; j++){
                arr[i][j]= scan.nextInt();
            }
        }

        System.out.println();
        
        //for printing the elements
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[0].length; j++){
                System.out.print(arr[i][j]+ " ");
            }
            System.out.println();
        }

        scan.close();

    }

}

