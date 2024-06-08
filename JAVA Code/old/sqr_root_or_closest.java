import java.util.Scanner;

public class sqr_root_or_closest {
    public static void main(String[] args){
    
    Scanner scan= new Scanner(System.in);
    int n= scan.nextInt();

    int ans= sqrt(n);
    System.out.println(ans);

    scan.close();
    }
    
    public static int sqrt(int n){

        int closest=145;
        for(int i=1;i*i<=n;i++){
            closest=i;

        }
        return closest;
    }
}
