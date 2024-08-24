import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class zigzag_array {
    public static void main(String[] args){
    
    Scanner scan = new Scanner(System.in);
    int n = scan.nextInt();
    int m = scan.nextInt();

    int [][] arr= new int[n][m];

    for(int i=0; i<arr.length;i++){
        for(int j=0;j<arr[0].length;j++){
            arr[i][j]=scan.nextInt();
        }
    }
    
    for(int i=0;i<n;i++){
        if(i%2==0){
        
        for(int j=0;j<m;j++){
        System.out.print(arr[i][j]+ " ");
        }
        }

        else{
        for(int j=m-1;j>=0;j--){
            System.out.print(arr[i][j]+ " ");
        }
        }
      
        System.out.println();
    }

    }
    
}
