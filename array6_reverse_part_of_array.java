import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class array6_reverse_part_of_array {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        int arr[]= new int[n];

        for(int i=0; i<n; i++){
            arr[i]= scan.nextInt();
        }

        int s= scan.nextInt();
        int e= scan.nextInt();

        reverse_part(arr, s, e);

        for(int i=0; i<n; i++){
            System.out.print(arr[i]+ " ");
        }

        scan.close();

    }

    public static void reverse_part(int arr[],int s, int e){

        int sp= s; // here on the RHS means the s that we recieved from the parameter
        int ep= e; // here on the RHS means the e that we recieved from the parameter

        while(sp<ep){
            int temp= arr[sp];
            arr[sp]= arr[ep];
            arr[ep]= temp;

            sp++;
            ep--;
        }

    }
 
}
