//this is a brainer move
import java.io.*;
import java.util.*;

public class fibonacci {
    public static void main(String[] args){
    
    int a = 0;
    int b = 1;
    int sum=0;

    Scanner scan = new Scanner(System.in);
    int n = scan.nextInt();
    
    for(int i=1;i<=n;i++){
        a=b;
        b=sum;
        sum= a+b;
    }
    System.out.println(sum);
    scan.close();

    }
}
