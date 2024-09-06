//find X^n using recursion
//time complexity is O(n) which is not good
import java.util.*;
public class power {
    public static int powerof(int x,int n){
        if(n==0){   //base case
            return 1;
        }
       int pownm1= powerof( x, n-1);
            int POW=x*pownm1;
            return POW;

    }
    public static void main(String args[]){
        System.out.println(powerof(2,4));
    }
}
