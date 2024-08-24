import java.io.*;
import java.util.*;

public class recursion_print_decreasing {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the value of n:");
        int n = scan.nextInt();
        
        decrease(n);
        scan.close();
    }
    
    public static void decrease(int n){
        //complete opposite
        if(n==1){
            System.out.println(1);
            return;
        }
        
        System.out.println(n);
        decrease(n-1);
        
    }
}
