import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class array9_two_sum_brute {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("Enter how many elements u want:");
        int n = scan.nextInt();

        int arr[] = new int[n];

        for(int i=0; i<n; i++){
            System.out.print("Enter array elements:");
            arr[i]= scan.nextInt();
        }

        System.out.print("Enter value of k:");
        int k= scan.nextInt();

        System.out.println(two_sum_brute(arr, k));




    }
    
    public static boolean two_sum_brute(int arr[], int k){

        for(int i=0; i<=arr.length-2; i++){
            for(int j=i+1; j<=arr.length-1; j++){
                if(arr[i]+arr[j]==k){
                    return true;
                }
            }
        }

        return false;

    }
}

//TC- O(n^2) , SC- O(1) 
//Logic
//Checking possible pairs, avoid the same elements
//always draw all possible i,j pairs like (0,0),(0,1)...etc, 
//neglect the same element like (0,0) and same pairs like (1,0) and (0,1)-avoid one in this  
//2 for loops are needed in which one is nested , check that if i+j==k and return true if yes else false
