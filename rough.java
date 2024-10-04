import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class rough{
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int n= scan.nextInt();
        int m= scan.nextInt();

        int arr[][]= new int[n][m];

        for(int i=0; i<arr[0].length; i++){
            for(int j=0; j<arr.length; j++){
                arr[i][j]= scan.nextInt();
            }
        }

        for(int i=0; i<arr[0].length; i++){
            for(int j=0; j<arr.length; j++){
                System.out.print(arr[i][j]+ " ");
            }
            System.out.println();
        }

    }
}
