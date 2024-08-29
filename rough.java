import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class rough {
    public static void main(String[] args) {
        //rotate array last to first k times 

        Scanner scan = new Scanner(System.in);
        System.out.print("Enter size of array:");
        int n = scan.nextInt();

        int arr[]= new int[n];

        for(int i=0; i<n; i++){
            System.out.print("Enter array elements:");
            arr[i]= scan.nextInt();
        }

        System.out.print("Enter value of k:");
        int k = scan.nextInt();

        k= k%n; // to avoid to many rotations to conserve time complexity

        rotatelasttofirstbyk(arr,0,n-1);
        rotatelasttofirstbyk(arr, 0, k-1);
        rotatelasttofirstbyk(arr, k, n-1);


        for(int i=0; i<n; i++){
            System.out.print(arr[i]+ " ");
        }

        scan.close();

    }

    public static void rotatelasttofirstbyk(int arr[],int s, int e){

        int sp= s;
        int ep= e;

        while(sp<ep){

            int temp = arr[sp];
            arr[sp]= arr[ep];
            arr[ep]= temp;

            sp++;
            ep--;
        }
    }



    


}
