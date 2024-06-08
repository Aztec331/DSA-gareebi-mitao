import java.util.Scanner;

public class primenum {
    public static void main(String[] args){

    Scanner scan = new Scanner(System.in);
    System.out.print("Enter your number:");
    int n = scan.nextInt();
    
    int count=0;
    for(int i=1;i<=n;i++){
        if(n%i==0){
        count+=1;
        }
    }
    if(count==2){
        System.out.println("Yay");
    }
    else{
        System.out.println("Nay");
    }
    
    scan.close();

    }
    
}
