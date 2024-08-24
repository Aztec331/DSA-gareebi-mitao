import java.util.*;

public class recursion_sum {
    public static void main(String[] args){

    Scanner scan = new Scanner(System.in);
    int n = scan.nextInt();

    int ans= sum(n);
    System.out.println(ans);
    scan.close();
    }


    public static int sum(int n){
        if(n==1){return 1;}

        int temp= sum(n-1);

        return temp+n;

    }
}


