//for given set of strings print the largest string
//lexicographical way
//means if 1st string is a and 2nd string is b than 2nd string is largest
import java.util.*;
public class largestString {
    public static void main(String args[]){
        String player[]={"rohit","bumrah","sky"};
        String largest=player[0];
        for(int i=1; i<player.length; i++){
            if(largest.compareTo(player[i])<0){
                largest=player[i];
            }

        }
        System.out.println(largest);

    }

}
