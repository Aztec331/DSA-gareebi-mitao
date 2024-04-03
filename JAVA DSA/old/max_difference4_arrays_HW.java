import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class max_difference4_arrays_HW {
    public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    int n = scan.nextInt();

    int[] arr= new int[n];

    for(int i=0;i<n;i++){
        arr[i]= scan.nextInt();
    }

    int ans1 = maxdifff2(arr);
    int ans2 = maxdifff3(arr);

    System.out.println(Math.max(ans1, ans2));
    scan.close();

}
    public static int maxdifff2(int[] arr){
    
    int n = arr.length;

    for(int i=0;i<n;i++){
        arr[i]= arr[i]+i;
    }
    
    int max = Integer.MIN_VALUE;
    int min = Integer.MAX_VALUE;

    for(int i=0 ; i<n; i++){
        if(arr[i]>max){max= arr[i];}
        if(arr[i]<min){min= arr[i];}
    }

    for(int i=0;i<n;i++){
        arr[i]=arr[i]-i;
    }

    return max-min;

    }

    public static int maxdifff3(int[] arr){
    
        int n = arr.length;
    
        for(int i=0;i<n;i++){
            arr[i]= arr[i]-i;
        }
        
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
    
        for(int i=0 ; i<n; i++){
            if(arr[i]>max){max= arr[i];}
            if(arr[i]<min){min= arr[i];}
        }

        for(int i=0;i<n;i++){
            arr[i]=arr[i]+i;
        }
    
        return max-min;
    
    }

}

