import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class max_difference_arrays_HW {
    public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    int n = scan.nextInt();

    int[] arr= new int[n];

    for(int i=0;i<n;i++){
        arr[i]= scan.nextInt();
    }

    int result= maxdifff(arr);
    System.out.println(result);

    scan.close();

}
    public static int maxdifff(int[] arr){
    
    int n = arr.length;
    
    int max = Integer.MIN_VALUE;
    int min = Integer.MAX_VALUE;

    for(int i=0 ; i<n; i++){
        if(arr[i]>max){max= arr[i];}
        if(arr[i]<min){min= arr[i];}
    }

    //System.out.print(max+ " ");
    //System.out.println(min);
    return max-min;

    }
    
}

