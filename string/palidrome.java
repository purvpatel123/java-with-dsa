//given string is palidrom or not
import java.util.*;
public class palidrome{
    public static boolean ispalidrome(String str){
           int n=str.length();
           for (int i=0;i<n/2;i++) {
               if (str.charAt(i) != str.charAt(n - 1 - i)) {
                   return false;
               }
           }
           return true;
    }
public static void main(String args[]){
        String str="noon";
       System.out.println( ispalidrome(str));
}
}
