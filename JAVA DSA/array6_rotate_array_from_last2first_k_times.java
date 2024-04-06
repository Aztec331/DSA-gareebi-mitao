// 1. Apply the logic of reversing an array.

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class array6_rotate_array_from_last2first_k_times {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        int[] arr = new int[n];

        for(int i=0; i<n; i++){
            arr[i]=scan.nextInt();
        }

        int k = scan.nextInt();

        rotatebyk(arr, k);

        
    }

    public static void rotatebyk(int[] arr, int k){

        int k = k; //on the RHS this means the input value that we'll provide



    }



    
}
