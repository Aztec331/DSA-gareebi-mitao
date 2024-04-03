import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class column_wise_array {
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

    //no of rows ->> arr.length== n , arr.length gives length of the row
    //no of columns ->> arr[0].length==m, arr[0] gives length of column
    for(int j=0;j<arr[0].length;j++){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i][j]+ " ");
        }
        System.out.println();
    }

    scan.close();
    }
    
}
