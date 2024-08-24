import java.io.*;
import java.util.*;

public class sum_of_array {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt(); // to take input of a number
        int[] arr= new int[n];// to take how many elements do you want in your array, {0,0,0,0,0} array was created after this
        
        int sum = 0;
        //read n elements of the array, we'll be giving 5
        for(int i=0;i<n;i++){
            arr[i]= scan.nextInt(); //{10,20,30,40,50}- this is a stuffed array with n number of integers in it
        }
        
        for(int i=0;i<n;i++){      // use a seperate for loop for sum of all indivisual elements
            sum+=arr[i];
        }

        System.out.println(sum);
        System.out.println(arr.length);

        scan.close();
    }
    
}
