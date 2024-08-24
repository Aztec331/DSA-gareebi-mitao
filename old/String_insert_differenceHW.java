import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class String_insert_differenceHW {
    public static void main(String[] args){
    
    Scanner scan = new Scanner(System.in);
    String input = scan.nextLine();
    System.out.println(insertdiff(input));
    scan.close();
    }

// C me data type is "string" java me it is "String"
public static String insertdiff(String str){
    int n=str.length();
    String add= "";

    for(int i=0;i<n-1;i++){
        add= add+ str.charAt(i);
        int temp = str.charAt(i+1)- str.charAt(i);
        add = add+temp;
        }

    
    add= add+str.charAt(str.length()-1);
    return add;
}

}