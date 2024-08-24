import java.util.*;

public class array1{
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        //Length of array
        int n = scan.nextInt();
        
        //array of size n
        int arr[] = new int[n];

        //inputting indivisual elements
        for(int i=0; i<n; i++){
            arr[i]=scan.nextInt();
        }

        //printing indivisual inputted elements
        for(int i=0; i<n; i++){
            System.out.print(arr[i]+ " ");
        }






    }
}