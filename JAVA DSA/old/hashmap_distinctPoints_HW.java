import java.util.*;

class hashmap_distinctPoints_HW{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int m = scan.nextInt();

        int[] x= new int[n];
        int[] y= new int[m];
        
        for(int i=0;i<n;i++){
            x[i]= scan.nextInt();
        }

        for(int i=0;i<m;i++){
            y[i]= scan.nextInt();
        }

        System.out.println(distinct(x, y));
        scan.close();
    }
    public static int distinct(int[] x, int[] y){

        //key of hashmaps should be the whole values of x and y like (2,3):1 is a key values pair
        HashSet<String> hs = new HashSet<>();

        for(int i=0;i<x.length;i++){
            hs.add(x[i]+""+y[i]);
        }

        return hs.size();
    }

    }

