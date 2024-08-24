import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class array4_largest_num_atleasttwice {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        int arr[] = new int[n];

        for(int i=0; i<n; i++){
            arr[i]= scan.nextInt();
        }
        System.out.println(dominant_index(arr));



        scan.close();
    }

    public static int dominant_index(int arr[]){

        int max= Integer.MIN_VALUE;
        int index= -1;
        int secondmax= Integer.MIN_VALUE;

        for(int i=0; i<arr.length; i++){
            
            if(arr[i]>max){
                secondmax=max;
                max=arr[i]; //here we mean value of max
                index= i; // here we mean index of i
            }
            else if(arr[i]>secondmax){
                secondmax= arr[i];
            }
        }

        if(secondmax*2<=max){
            return index;
        }
        else{
            return -1;
        }
        //So efficient 



    }
}


// Logic:
// 1.	We must find the greatest and the second greatest element in the array.
// 2.	Every other element in the array will be smaller than the second greatest element.
// 3.	secondmax is the second largest element in the array.
// 4.	Check if secondmax * 2 <= max. If yes, then return the index of max. Otherwise, return -1.
// Tip:
// 1.	Handle the edge case where secondmax is the last number in the array and max is the second last. 
//      In this case, the for loop will not run on the last element to check for secondmax, so check this using another for loop on the array with 'else if(arr[i]>secondmax){secondmax = arr[i]}
// 2.	Keep secondmax at the top in the for loop of checking the maximum element. This is because we copy max into secondmax first and then copy the maximum element into max.
