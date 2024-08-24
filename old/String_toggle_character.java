import java.util.*;

public class String_toggle_character {
    public static void main(String[] args){

    Scanner scan = new Scanner(System.in);
    String input = scan.nextLine();
    char[] chararray= input.toCharArray();
    //Since the toggle method doesn't return a value, 
    //you can't assign it to a String variable 
    toggle(chararray);
    String converted= new String(chararray);
    System.out.println(converted);
    scan.close();
    }
   
    
    public static void toggle(char[] ch){
        
        for(int i=0;i<ch.length;i++){ 
            if(ch[i]>=65 && ch[i]<=90){ //upercase range
                ch[i]= (char)(ch[i]+32); // Convert uppercase to lowercase
            }
            else{
                ch[i]= (char)(ch[i]-32); // Convert lowercase to uppercase
            }
        }
    }
}
