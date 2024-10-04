import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class array12_2darray_colwise {
    public static void main(String[] args) {

        //everything we're doing for is for money
        //ofc behenchod
        Scanner scan = new Scanner(System.in);

        int n=scan.nextInt();
        int m=scan.nextInt();

        int arr[][]= new int[n][m];

        //taking in the elements
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[0].length; j++){
                arr[i][j]= scan.nextInt();
            }
        }
        
        for(int j=0; j<arr[0].length; j++){
            for(int i=0; i<arr.length; i++){
                System.out.print(arr[i][j]+ " ");
            }
            System.out.println();
        }
        
    }
    
}
