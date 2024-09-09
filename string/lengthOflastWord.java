//find the length of last word from any given string
import java.util.*;
public class lengthOflastWord {

        public static int lengthoflastWord(String s) {
            int length=0;
            for(int i=s.length()-1;i>=0;i--){
                char c=s.charAt(i);

                if(c!=' '){
                    length++;
                }else if(length>0){
                    break;
                }
            }

            return length;
        }
        public static void main(String args[]){
            String s="hello my name is";
         System.out.println(lengthoflastWord(s));
        }
}
