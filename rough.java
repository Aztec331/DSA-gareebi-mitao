import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

import javax.sound.sampled.SourceDataLine;

public class rough {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("Enter length for array:");
        int n = scan.nextInt();

        int arr[] = new int[n];

        for(int i=0; i<n; i++){
            System.out.print("Enter array elements:");
            arr[i]= scan.nextInt();
        }



    } 


    public static int largest_atleast_twice(int arr[]){

        int max = Integer.MIN_VALUE;
        int secondmax = Integer.MAX_VALUE;
        int index = -1;

        for(int i=0; i<arr.length; i++){
            if(arr[i]>max){
                secondmax=max;
                max= arr[i];
                index= max;
            }

        }

    }
    
}
