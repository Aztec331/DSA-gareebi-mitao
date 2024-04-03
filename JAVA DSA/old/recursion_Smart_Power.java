import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class recursion_Smart_Power {
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int n = scan.nextInt();

        System.out.println(Pow(a, n));
        scan.close();
    }
    static long Pow(int a, int n){
        if (n==1){return a;}

        long temp= Pow(a,n/2);
        if(n%2==0){return temp*temp;}
        else{return temp*temp*a;}
    }
}