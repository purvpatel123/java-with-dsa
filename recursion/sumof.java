//print sum of first n natural number
import java.util.*;
public class sumof {
    public static int Sum(int n){
       if(n==1){
           return 1;
       }
        int sums=Sum(n-1);
        int finalsum=sums+n;
        return finalsum;
    }
    public static void main(String args[]){
        int n=50;
        System.out.println(Sum(n));
    }
}
