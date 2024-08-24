import java.util.*;

public class hashmap_frequency_queries {
    public static void main(String[] args){
    
    Scanner scan= new Scanner(System.in);
    int n = scan.nextInt();
    int m = scan.nextInt();

    int[] arr= new int[n];
    for(int i=0;i<n;i++){
        arr[i]= scan.nextInt();
    }

    int[] queries= new int[m];
    for(int i=0;i<m;i++){
        queries[i]= scan.nextInt();
    }

    frequency(arr, queries);
    scan.close();

    } 

    public static void frequency(int[] arr,int[] queries) {
    
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

    for(int num: queries){
        if(hm.containsKey(num)==true){
            System.out.print(hm.get(num)+ " ");
        }
        else{
            System.out.print(0+ " ");
        }
    }
    
    }
}
