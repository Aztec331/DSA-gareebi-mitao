import java.util.Scanner;

public class problem4 {
    public static void main(String[] args){
    
    Scanner scan = new Scanner(System.in);
    int n = scan.nextInt();

    if(n%2==0 && n%3==0){
        System.out.println("divisible");
    }
    else{
        System.out.println("not divisible");
    }

    }
    
    
}
