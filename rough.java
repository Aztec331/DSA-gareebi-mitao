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

        for(int i=0; i<n; i++){
            System.out.print(arr[i]+ " ");
        }

        scan.close();

    }



    


}
