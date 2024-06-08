import java.util.Scanner;

public class function{
    public static void main(String[] args){
        Scanner scan= new Scanner(System.in);
        System.out.print("Enter your number1:");
        int n= scan.nextInt();
         System.out.print("Enter your number2:");
        int r= scan.nextInt();

        int nfact= fact(n);
        int rfact= fact(r);
        int difffact= fact(n-r);

        int npr= nfact/(difffact);
        int ncr= nfact/(rfact*difffact);
        
        System.out.println("-------------------------------");
        System.out.println(nfact);
        System.out.println("-------------------------------");
        System.out.println(npr);
        System.out.println("-------------------------------");
        System.out.println(ncr);
    }

    public static int fact(int x){
        
        int ans=1;
        for(int i=1;i<=x;i++){
            ans=ans*i;
        }
        return ans;

    } 

}

