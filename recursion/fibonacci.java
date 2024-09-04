//print nth fibonacci number
import java.util.*;

public class fibonacci {
    public static int Fibo(int n){
        if(n==0) {
            return 0;
        } else if (n == 1) {
            return 1;
        }
        int fbm1=Fibo(n-1);
        int fbm2=Fibo(n-2);
        int fibo=fbm1+fbm2;
           return fibo;
    }
    public static void main(String args[]){
        int n=5;
        System.out.println(Fibo(n));
    }
}

//time complexity is O(2^n)
//space complexity is O(n)