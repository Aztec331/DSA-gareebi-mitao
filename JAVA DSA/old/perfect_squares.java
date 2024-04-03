//we got you aztec
import java.io.*;
import java.util.*;

public class perfect_squares {
    public static void main(String[] args){
    Scanner scan= new Scanner(System.in);
    int num= scan.nextInt();
    
    int temp=0;
    for(int i=1;i*i<=num;i++){
        temp=i;
    }
    if(temp*temp==num){
        System.out.println(true);
    }
    else{
        System.out.println(false);
    }

    scan.close();
    }
    
}
