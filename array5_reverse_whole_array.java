import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class array5_reverse_whole_array{
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        int arr[]= new int[n];

        for(int i=0; i<n; i++){
            arr[i]=scan.nextInt();
        }

        reverse(arr);

        for(int i=0; i<n; i++){
            System.out.print(arr[i]+ " ");
        }

        scan.close();
    }


    public static void reverse(int arr[]){
        
        int sp=0; //this represents first element
        int ep=arr.length-1; // arr.length-1 represents last element

        while(sp<ep){
            int temp= arr[sp];
            arr[sp]= arr[ep];
            arr[ep]=temp;

            sp++;
            ep--;

        }

    }

}

// Sure, here are the points along with the tip:

// 1. The logic swaps elements at start point (sp) and end point (ep) in an array.
// 2. The swapping continues as long as `sp<ep`.
// 3. For example, in the array `{1,2,3,4,5,6}`, the pairs `(0,5)`, `(1,4)`, and `(2,3)` are swapped.
// 4. The loop stops when `sp` is no longer less than `ep`.
// 5. A `temp` variable is used to swap two numbers.
// 6. **Tip**: Remember how to swap using a variable called `temp` for two numbers. This is a common technique in programming to swap two variables' values without losing either one in the process.