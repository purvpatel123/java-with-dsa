//print 1 to 10 in Incresing order using recursive method
import java.util.*;
public class printNoInIncreasingOrder {
        
    public static void printInc(int n){
        if(n==1){
            System.out.println(n);
            return;
        }
        printInc(n-1);
        System.out.println(n+" ");

    }
    public static void main(String args[]){
        int n=10;
        printInc(n);
    }
}


