import java.io.*;
import java.util.*;

public class reverse_array {
    
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        int[] arr = new int[n];

        for(int i=0; i<n;i++){
            arr[i]= scan.nextInt();
        }

        for(int i=0; i<n;i++){
            System.out.print(arr[i]+ " ");
        }
      
        reverse(arr);

        System.out.println();
        for(int i=0; i<n;i++){
            System.out.print(arr[i]+ " ");
        }

    }

    public static void reverse(int[] num){

        int sp = 0;
        int ep = num.length-1; //arr.length will give us length of the array and -1 will give us the last index

        while(sp<ep){
            int temp = num[sp];
            num[sp]= num[ep];
            num[ep]= temp;

            sp++;
            ep--;
        }
    }
}
