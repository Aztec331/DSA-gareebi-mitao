// Sure, here are the points along with the tip:

// 1. The logic swaps elements at start point (sp) and end point (ep) in an array.
// 2. The swapping continues as long as `sp<ep`.
// 3. For example, in the array `{1,2,3,4,5,6}`, the pairs `(0,5)`, `(1,4)`, and `(2,3)` are swapped.
// 4. The loop stops when `sp` is no longer less than `ep`.
// 5. A `temp` variable is used to swap two numbers.
// 6. **Tip**: Remember how to swap using a variable called `temp` for two numbers. This is a common technique in programming to swap two variables' values without losing either one in the process.
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class array4_reverse_whole_array{
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();

        int[] arr= new int[n];

        for(int i=0; i<n; i++){
            arr[i]=scan.nextInt();
        }

        reverse(arr); //array ke saath bhalatkar kar fir array print kar

        System.out.println();

        for(int i=0; i<arr.length ;i++){
            System.out.print(arr[i]+ " ");
        }

        scan.close();
    }

    public static void reverse (int[] num){

        int sp =0;
        int ep = num.length-1;

        while(sp<ep){
            
            int temp = num[sp];
            num[sp]= num[ep];
            num[ep]= temp;

            sp++;
            ep--;
        }
    }
}
