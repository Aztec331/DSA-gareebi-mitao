//arrays across functions are connected and whereas variables are not !
import java.io.*;
import java.util.*;

public class arr_swap_indexes {
    public static void main(String[] args){
    
    Scanner scan = new Scanner(System.in);
    int n = scan.nextInt();

    int[] arr = new int[n]; // to make an empty array of n elements
    
    for(int i=0; i<n;i++){
        arr[i]= scan.nextInt();
    }

    int idx1= scan.nextInt();
    int idx2= scan.nextInt();

    int temp= arr[idx1];
    arr[idx1]=arr[idx2];
    arr[idx2]= temp;

    for(int i=0;i<n;i++){
        System.out.print(arr[i]+ " ");
    }
    
    }
    
}
