import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class array8_count_greater{
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        int[] arr= new int[n];

        for(int i=0;i<n;i++){
            arr[i]= scan.nextInt();
        }

        int max = Integer.MIN_VALUE;

        for(int i=0;i<n;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }

        int count= 0;

        for(int i=0;i<n;i++){
            if(arr[i]==max){
                count++;
            }
        }

        int ans= arr.length-count;
        //System.out.println(max);
        System.out.println(ans);

        scan.close();


    }
}




