import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
public class rough {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        int remainder = 0;

        for(int i=2; i<number;i++){
            remainder= number%i;
        }

        if(remainder==0){
            System.out.println("Not prime");
        }
        else{
            System.out.println("Prime");
        }


    }
}

