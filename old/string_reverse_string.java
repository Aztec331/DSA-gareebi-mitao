import java.util.Scanner;

public class string_reverse_string {
    public static void main(String[] args){
    
    Scanner scan = new Scanner(System.in);
    String input = scan.nextLine();
    System.out.println(reversal(input));
    scan.close();
    }



    public static String reversal(String str){

        char[] ch= str.toCharArray();

        int sp=0;
        int ep=ch.length-1;

        while(sp<ep){       //loop ends when sp becomes greater than ep
            char temp=ch[sp]; 
            ch[sp]=ch[ep];
            ch[ep]= temp;

            sp++;
            ep--;
        }

        return "".valueOf(ch);

     }
}
