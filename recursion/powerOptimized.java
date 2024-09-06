//optimization way for finding X^N(power)
//time complexity for this method is O(logn) which is good
import java.util.*;
public class powerOptimized {
    public static int pow(int x,int n){
        if(n==0){
            return 1;
        }
        int dividedpow=pow( x,n/2);
        int halfpow=dividedpow*dividedpow;
        if(n%2!=0){
            int POW=x*halfpow;
            return POW;
        }
        return halfpow;
    }
    public static void main(String args[]){

        System.out.println(pow(2,9));
    }
}
