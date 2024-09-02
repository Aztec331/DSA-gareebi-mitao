import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class array10_max_difference3 {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter how many elements u want:");
        int n = scan.nextInt();

        int arr[] = new int[n];

        for(int i=0; i<n; i++){
            System.out.print("Enter array elements:");
            arr[i]= scan.nextInt();
        }
        
        System.out.println(max_diff3(arr));
        
        scan.close();
    }

    public static int max_diff3(int arr[]){

        int n= arr.length;
        int max= Integer.MIN_VALUE;
        int min= Integer.MAX_VALUE;
        for(int i=0; i<n; i++){
            arr[i]= arr[i]-i;
        }

        for(int i=0; i<n; i++){
            if(arr[i]>max){
                max=arr[i];
            }
            if(arr[i]<min){
                min=arr[i];
            }
        }

        return max-min;
    }
    
}
