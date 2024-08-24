import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class array8_two_sum_brute {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        int arr[] = new int[n];

        for(int i=0; i<n; i++){
            System.out.print("Enter array elements:");
            arr[i]= scan.nextInt();
        }

        System.out.print("Enter value of k:");
        int k= scan.nextInt();

        two_sum_brute(arr, k);




    }
    
    public static boolean two_sum_brute(int arr[], int k){
        
        
    }






}
