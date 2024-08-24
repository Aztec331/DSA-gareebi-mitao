import java.util.*;

public class recursion_fibonacci {
    public static void main(String[] args){

    Scanner scan = new Scanner(System.in);
    int n = scan.nextInt();

    int ans= fibonacci(n);
    System.out.println(ans);
    scan.close();

    }


    public static int fibonacci(int n){
        if(n==0){return 0;}
        if(n==1){return 1;}


        int temp1= fibonacci(n-1);
        int temp2= fibonacci(n-2);

        return temp1+temp2;

    }
}


