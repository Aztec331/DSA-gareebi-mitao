import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class hashmap_Count_of_Right_Angled_Triangle_HW {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[][] arr = new int[n][2];
        
        for(int i=0;i<n;i++){
            for(int j=0;j<2;j++){
                arr[i][j] = scan.nextInt();
            }
        }
        
        System.out.println(RightAngled(arr,n));
        scan.close();
    }
    
    static int RightAngled(int arr[][], int n){

    HashMap<Integer, Integer> xpoints = new HashMap<>();
    HashMap<Integer, Integer> ypoints = new HashMap<>();

    for (int i = 0; i < n; i++){
        if(xpoints.containsKey(arr[i][0])){
            xpoints.put(arr[i][0], xpoints.get(arr[i][0]) + 1);
        }else{
            xpoints.put(arr[i][0], 1);
            }
        if(ypoints.containsKey(arr[i][1])){
             ypoints.put(arr[i][1], ypoints.get(arr[i][1]) + 1);
        }
        else{
             ypoints.put(arr[i][1], 1);
            }
    }

        int count = 0;

        for (int i = 0; i < n; i++){
            if (xpoints.get(arr[i][0]) >= 1 &&
                ypoints.get(arr[i][1]) >= 1){

                count += (xpoints.get(arr[i][0]) - 1) *
                    (ypoints.get(arr[i][1]) - 1);
            }
        }

    
        return count;
    }

}
