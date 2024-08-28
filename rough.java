import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class rough {
    public static void main(String[] args) {
        //Reverse part of array

        Scanner scan = new Scanner(System.in);
        System.out.print("Enter size of array:");
        int n = scan.nextInt();

        int arr[]= new int[n];

        for(int i=0; i<n; i++){
            System.out.print("Enter array elements:");
            arr[i]= scan.nextInt();
        }

        System.out.print("Enter index1:");
        int x= scan.nextInt();
        System.out.print("Enter index1:");
        int y= scan.nextInt();
        

        reversepartofarray(arr, x, y);

        for(int i=0; i<n; i++){
            System.out.print(arr[i]+ " ");
        }

        scan.close();

    }

    public static void reversepartofarray(int arr[], int x, int y){

        int sp = x;
        int ep = y;

        while(sp<ep){
            int temp = arr[sp];
            arr[sp]= arr[ep];
            arr[ep]= temp;

            sp++;
            ep--;

        }

    }

    


}
