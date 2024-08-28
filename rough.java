import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

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

        System.out.println(largest_atleast_twice(arr));

        scan.close();

    } 


    public static int largest_atleast_twice(int arr[]){

        int max = Integer.MIN_VALUE;
        int secondmax = Integer.MIN_VALUE;
        int maxindex = -1;

        for(int i=0; i<arr.length; i++){
            if(arr[i]>max){
                secondmax=max;
                max= arr[i];
                maxindex= i;// silly mistake
            }
        }

        //we've already defined secondmax above
        //hence we're checking if we have any element
        //after the maximum which has possibilty to be 
        //secondmax
        for(int i=0; i<arr.length; i++){
            if(arr[i]>secondmax){
                secondmax=arr[i];
            }
        }

        if(secondmax*2<=max){
            return maxindex;
        }
        else{
            return -1;
        }
        

    }
    
}
