//given n friends,each one can remain single or can be paired up with some other friend.
//each friend can be paired only once.find out the total number of ways in which friends
//can remain single or can be paired up.
import java.util.*;
public class friendsPairing {
    public static int friends(int n){
        //basecase
        if(n==1 || n==2){
            return n;
        }
        //choice
        //single
        int fnm1=friends(n-1);

        //pairs
        int fnm2=friends(n-2);
        int pairing=(n-1) * fnm2;
        //totalways
        int total=fnm1+pairing;
        return total;
    }
public static void main(String args[]){
       System.out.println( friends(4));
}
}
