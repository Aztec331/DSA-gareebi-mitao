import java.util.*;

public class rotate_array {
    public static void main(String[] args){
    
    Scanner scan = new Scanner(System.in);
    int n = scan.nextInt();

    int[] arr = new int[n];

    for(int i=0;i<n;i++){
        arr[i]= scan.nextInt();
    }

    int k = scan.nextInt();
    
    k=k%n; //we wrote this for the possibilty that user can give the value of n smaller than k , k=k%n ensures that you always get the remainder as k
    //and even if n is equal to k you will get a zero.

    rotatePART(arr,0,n-1);
    rotatePART(arr,0,k-1);
    rotatePART(arr,k,n-1);
    
    for(int i=0;i<n;i++){
        System.out.print(arr[i]+" ");
    }
    scan.close();

    }

    public static void rotatePART(int[]arr, int s, int e ){
    
    int spidx= s;
    int epidx= e;

    while(spidx<epidx){
        int temp= arr[spidx];
        arr[spidx]= arr[epidx];
        arr[epidx]= temp;

        spidx++;
        epidx--;
    }
    }

}
