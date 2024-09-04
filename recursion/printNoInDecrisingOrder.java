//print 10 to 1 in decresing order using recursive method
import java.util.*;
public class printNoInDecrisingOrder {
    public static void printDec(int n){
       if(n==1){
           System.out.println(n);
           return;
       }
       System.out.println(n+" ");
       printDec(n-1);
    }
    public static void main(String args[]){
        int n=10;
        printDec(n);
    }
}
