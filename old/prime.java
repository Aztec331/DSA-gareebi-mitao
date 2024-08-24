import java.util.Scanner;

public class prime {
    public static void main(String[] args){
    
    Scanner scan = new Scanner(System.in);

    int n = scan.nextInt();
    int count = 0;
    for (int i=1;i<=n;i++){
        if(n%i==0){
            System.out.println(i);
            count+=1;
        }
    }
    if(count>2){
        System.out.println("Composite number");
    }
    
    else{
        System.out.println("Prime number");
    }
    }
}
