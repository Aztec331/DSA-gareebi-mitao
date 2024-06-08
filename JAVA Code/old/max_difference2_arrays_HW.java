import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

// "static void main" must be defined in a public class.
public class max_difference2_arrays_HW {
    public static void main(String[] args) {
        
       Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[]arr = new int[n];
        
        for(int i=0;i<n;i++){
            arr[i] = scn.nextInt();
        }
        
        System.out.println(maxdifference_1(arr));
       
    }
    
    public static int maxdifference_1(int[]arr){
        for(int i=0;i<arr.length;i++){
            arr[i] = arr[i] + i;
        }
        
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        
        for(int i=0;i<arr.length;i++){
            if(arr[i] > max){max = arr[i];}
            if(arr[i] < min){min = arr[i];}
        }
        
        return max - min;
    }
}
