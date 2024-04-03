import java.util.*;

public class hashmap_NonRepeatingElement {
    public static void main(String[] args){
    
    Scanner scan= new Scanner(System.in);
    int n = scan.nextInt();

    int[] arr= new int[n];
    for(int i=0;i<n;i++){
        arr[i]= scan.nextInt();
    }
    System.out.println(norepeat(arr));
    scan.close();

    } 

    public static int norepeat(int[] arr) {
    
    //hashmap created whose name is hm
    HashMap<Integer,Integer> hm = new HashMap<>();

    for(int num: arr){
        if(hm.containsKey(num)==true){
            int temp= hm.get(num);
            hm.put(num,temp+1);
        }
        else{
            hm.put(num,1);
        }
    }

    for(int num:arr){
        if(hm.get(num)==1){
            return num; //here num refers to the keys
        }
    }
    return -1; // if no non repeating element is found
    }
}
