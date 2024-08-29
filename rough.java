import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class rough {
    public static void main(String[] args) {
        //i understood this game now and i'll beat this

        Scanner scan = new Scanner(System.in);
        System.out.print("Enter size of array:");
        int n = scan.nextInt();

        int arr[]= new int[n];

        for(int i=0; i<n; i++){
            System.out.print("Enter array elements:");
            arr[i]= scan.nextInt();
        }

        System.out.println(count_greater(arr));

        scan.close();

    }

    public static int count_greater(int arr[]){

        int max = Integer.MIN_VALUE;
        int countmax= 0;

        for(int i=0; i<arr.length; i++){
            if(arr[i]>max){
                max=arr[i];
            }

        }

        for(int i=0; i<arr.length; i++){
            if(arr[i]==max){
                countmax++;
            }
        }

        int worthy= arr.length-countmax;

        return worthy;


    }




    


}
