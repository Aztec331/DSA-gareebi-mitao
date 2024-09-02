import java.util.*;

public class array2_swapping_2indexes{
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        //length of an array
        int n = scan.nextInt();

        //define array of length n
        int arr[]= new int[n];

        //take input for elements in your array 
        for(int i=0; i<n; i++){
            arr[i]= scan.nextInt();
        }

        //take input of swapping indexes
        int idx1= scan.nextInt();
        int idx2= scan.nextInt();

        //swapping of 2 indexes
        int temp= arr[idx1];
        arr[idx1]= arr[idx2];
        arr[idx2]= temp;

        for(int i=0; i<n; i++){
            System.out.print(arr[i]+ " ");
        }

        scan.close();

    }

}



