import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class array9_max_difference2{
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter how many elements u want:");
        int n = scan.nextInt();

        int arr[] = new int[n];

        for(int i=0; i<n; i++){
            System.out.print("Enter array elements:");
            arr[i]= scan.nextInt();
        }
        
        System.out.println(max_diff2(arr));
        
        scan.close();
    }   
    
    public static int max_diff2(int arr[]){

        int n= arr.length;
        int max= Integer.MIN_VALUE;
        int min= Integer.MAX_VALUE;
        for(int i=0; i<n; i++){
            arr[i]=arr[i]+i;
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

//TC-O(N) & SC-O(1)(as the array is given)
// Rewrite Expression: Transform arr[i] - arr[j] + i - j to ((arr[i] + i) - (arr[j] + j)).
// Modify Array: Add each index to its corresponding element: arr[i] = arr[i] + i.
// Find Max-Min: Traverse the array to find max and min, then return max - min to get the maximum difference.

