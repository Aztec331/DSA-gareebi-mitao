import java.util.Scanner;

public class problem5 {
    public static void main(String[] args){
    
    Scanner scan = new Scanner(System.in);
    int a = scan.nextInt();
    int b = scan.nextInt();
    int c = scan.nextInt();

    if(a>b && a>c){
        System.out.println(a);
    }
    else if(b>a && b>c){
        System.out.println(b);
    }
    else{
        System.out.println(c);
    }
    }
    
    
}
