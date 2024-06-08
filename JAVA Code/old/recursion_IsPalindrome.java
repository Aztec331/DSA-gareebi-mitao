import java.util.Scanner;

public class recursion_IsPalindrome {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        System.out.println(Ispalin(str,0,str.length()-1));
        scan.close();
    }

    static boolean Ispalin(String str,int s,int e){
        if(s==e){return true;}
        if(s>e){return true;}

        if(str.charAt(s)==str.charAt(e)){
            boolean temp = Ispalin(str, s+1, e-1);
            return temp;
        }
        else{
            return false;
        }
    }
}
