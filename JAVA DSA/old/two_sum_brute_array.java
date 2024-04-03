import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class two_sum_brute_array {
    public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    int n = scan.nextInt();
    
    int[] arr= new int[n];

    for(int i=0;i<n;i++){
        arr[i]= scan.nextInt(); 
    }

    int k = scan.nextInt();
    System.out.println(twosum(arr,k));
    scan.close();

    }
 
public static boolean twosum(int[] arr, int k ){

    int n = arr.length;

    for(int i=0;i<=n-2;i++){
        for(int j=i+1;j<=n-1;j++){
            if (arr[i]+arr[j]==k){
            return true;
            }
           
        }
    }
    return false;
}
    
}

