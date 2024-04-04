//same logic as the reverse whole array we just have to give
//starting point and end point
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class array5_reverse_part_of_array {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        int[] arr= new int[n];

        for(int i=0; i<n; i++){
            arr[i]= scan.nextInt();
        }

        int a = scan.nextInt();
        int b = scan.nextInt();

        reversePart(arr, a, b);

        for(int i=0; i<n; i++){
            System.out.print(arr[i]+ " ");
        }

    }

    public static void reversePart(int[] arr, int s, int e){

        int sp= s; // here on the RHS means the s that we recieved from the parameter
        int ep= e; // here on the RHS means the e that we recieved from the parameter

        while (sp<ep) {

            int temp = arr[sp];
            arr[sp]= arr[ep];
            arr[ep]= temp;

            sp++;
            ep--;
            
        }
    }
    
}
