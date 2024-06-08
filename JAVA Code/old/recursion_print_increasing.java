import java.io.*;
import java.util.*;

public class recursion_print_increasing {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the value of n:");
        int n = scan.nextInt();
        
        increase(n);
        scan.close();
    }
    
    public static void increase(int n){
        if (n==1){
            System.out.println(1);
            return;
        }

        increase(n-1);
        System.out.println(n);
    }
}
