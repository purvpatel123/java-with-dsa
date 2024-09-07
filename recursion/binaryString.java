//print  all binary Strings of size N without consicutive 1.
import java.util.*;
public class binaryString {
          public static void printBString(int n,int lastPlace,String Str){


              //base case
              if(n==0){
                  System.out.println(Str);
                  return;
              }
              if(lastPlace==0){
                  printBString(n-1,0,Str+"0");
                  printBString(n-1,1,Str+"1");
              }else
              {
                  printBString(n-1,0,Str+"0");
              }
          }
          public static void main(String args[]){
               printBString(3,0," ");
          }

}
