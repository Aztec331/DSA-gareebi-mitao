//read an array of N length and print the sum of all elements
//this world is so unfair, ham bhi faida uthaenge unfairness ka

import java.util.*;

public class array1_sum_of_all_elements_in_array{
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();

        int[] arr = new int[n];

        for(int i=0;i<n;i++){
            arr[i]= scan.nextInt();
        }

        //array ban gaya iske baad like -> {1,2,3,4,5}

        for(int i=0;i<n;i++){
            System.out.print(arr[i]+ " ");
        }

        System.out.println();
        System.out.println();
        System.out.println();

        int sum=0;
        for(int i=0;i<n;i++){
            sum+=arr[i];
        }

        System.out.println(sum);
        scan.close();
    }
}