import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class array6_rotate_array_from_last2first_k_times {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        int arr[]= new int[n];

        for(int i=0; i<n; i++){ 
            System.out.print("Enter the array values:");
            arr[i]= scan.nextInt();
        }

        System.out.print("Enter the value of K:");
        int k = scan.nextInt();

        k=k%n; //edge case

        rotatebyk(arr,0,n-1);
        rotatebyk(arr, 0,k-1);
        rotatebyk(arr, k,n-1);

        for(int i=0; i<n; i++){
            System.out.print(arr[i]+ " ");
        }

    }


    public static void rotatebyk(int arr[],int s,int e){

        int sp= s;
        int ep= e;

        while(sp<ep){
            int temp= arr[sp];
            arr[sp]= arr[ep];
            arr[ep]= temp;

            sp++;
            ep--;
        }


    }
    
}


//1. Apply the logic of reversing an array.
//*your will get same array after doing multiples of array.length rotation
//Logic- this too involves reversing the array logic, but we have to do multiple 
//reverses and reversing parts of the array too.
//edge case- why are we doing k=k%n ? you will get the same array after doing multiple last to first,
// for example - {4,1,6,9}, after 4 LTF(last to first) rotations will become {4,1,6,9} only,
//hence we have arr.length multiples will become the same array i.e 4,8,12 will give your the same rotations,
//so we for an exceptionally big number we should not rotate it that much to save time complexity and do 
// k=k%n so if we get k=9 for {4,1,6,9} where k=9 and arr.length/n= 4 we'll do k=9%4 which will give us remainder 1
//so as k is just 1 step more than 8(which here is multiple of 4) we only need to do 1 rotation for such big k values, hence k=k%n  

// To explain the concept and logic behind efficiently rotating an array by `k` steps, especially when `k` can be significantly large, let's break down the provided explanation into concise, to-the-point statements:

// 1. **Concept of Array Rotation**: The fundamental idea is that after performing a number of rotations equal to the length of the array (`n`), the array returns to its original configuration. This principle is key to understanding the optimization of the rotation process.

// 2. **Optimization with Modulo Operation (`k = k % n`)**: To avoid unnecessary rotations and improve efficiency, the number of rotations `k` is adjusted using the modulo operation with the array's length (`n`). This step ensures that only the minimum required number of rotations is performed, particularly useful for large values of `k`.

// 3. **Efficient Rotation through Triple Reversal**:
//     - **First Reversal**: The entire array is reversed. This action sets the stage for a more efficient rotation.
//     - **Second Reversal**: Only the first `k` elements (post-modulo adjustment) are reversed. This step starts to bring elements closer to their target positions for the final array configuration.
//     - **Third Reversal**: The last `n-k` elements are reversed, finalizing the positions of all elements in the rotated array.

// 4. **Rationale Behind `k = k % n`**:
//     - This adjustment accounts for the cyclic nature of array rotations, where rotating by the array's length (`n`) or its multiples results in the original array. It ensures that the rotation process is always as efficient as possible by reducing `k` to the smallest equivalent number of rotations needed.

// 5. **Handling Large Rotation Counts Efficiently**: The modulo operation (`k = k % n`) is particularly important for large `k` values, as it reduces the rotation count to a manageable number, directly impacting and improving the algorithm's time complexity.

// 6. **Illustrative Example**: For an array `{4,1,6,9}` with `k=9` and `n=4`, applying `k = 9 % 4` simplifies `k` to `1`. Thus, instead of performing 9 rotations, only 1 rotation is required—demonstrating the practical benefit of this optimization strategy for large `k` values.

//7. Always remeber aztec rotating array is always linked to reversing array
// This approach effectively minimizes computational effort and time complexity, making it a preferred method for rotating arrays, especially in scenarios where performance and efficiency are critical.
