import java.util.Scanner;

public class countfactors {
    public static void main(String[] args){

        System.out.print("Enter your number:");
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        System.out.println("Factors of the inputted number are given below");

        int count=0;
        for(int i=1;i<=n;i++){
            if(n%i==0){
                count+=1;
                System.out.println(i);
            }

        }

    }
    
}
