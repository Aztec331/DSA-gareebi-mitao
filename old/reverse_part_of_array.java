import java.io.*;
import java.util.*;

public class reverse_part_of_array {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        int[] arr = new int[n];

        for(int i=0;i<n;i++){
            arr[i]= scan.nextInt();
        }
        
        int s= scan.nextInt();
        int e= scan.nextInt();

        reversepart(arr,s,e);

        for(int i=0;i<n;i++){
            System.out.print(arr[i]+ " ");
        }
        
    }

    public static void reversepart(int[] num,int s,int e){
        int spidx= s;
        int epidx= e;

        while(spidx<epidx){
            int temp = num[spidx];
            num[spidx]= num[epidx];
            num[epidx]= temp;
            
            spidx++;
            epidx--;
         }

    }
    
}
//bitch i'm legally blind