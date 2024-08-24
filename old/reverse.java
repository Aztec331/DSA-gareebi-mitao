import java.util.Scanner;

public class reverse {
    public static void main(String[] args){
    
    Scanner scan= new Scanner(System.in);

    int n= scan.nextInt();

    //kaam kar jo chahiye uspe
    while(n>0){
        int last= n%10;
        System.out.print(last);
        n= n/10;
       
    }
    
    }
    
}
