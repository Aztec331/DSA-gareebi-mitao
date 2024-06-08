import java.util.Scanner;

public class floorceil {
    public static void main(String[] args){

        System.out.print("Enter your decimal noomber:");
        Scanner scan = new Scanner(System.in);
        float n= scan.nextFloat();

        int floor= (int) Math.floor(n);
        System.out.println(floor);
    }
    
}
