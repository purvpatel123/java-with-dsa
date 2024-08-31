//find substring of given string with perticular size
import java.util.*;
public class substring {
    public static String getsubstring(String str,int si,int ei){//si=starting index,ei=ending index
        String substr="";

        for(int i=si;i<ei;i++){
            substr += str.charAt(i);

        }
        return substr;
    }
    public static void main(String args[]){

        String str="helloworld";
        System.out.println(getsubstring(str,0,5));
    }
}
