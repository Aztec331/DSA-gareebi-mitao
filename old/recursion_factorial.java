import java.util.*;


public class recursion_factorial {
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
    
        int ans= factorial(n);
        System.out.println(ans);
        scan.close();
        }
    

    public static int factorial(int n){
        if(n==0){return 1;}

        int temp= factorial(n-1);
        
        return temp*n;
    }
    
}
