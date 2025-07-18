//first rearange the string  in reverse order and remove duplicate from that
import java.util.Scanner;

public class removeDuplicate {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the string from you want to remove duplicate");
        String name=sc.nextLine();

        String reversed="";

        for(int i=name.length()-1;i>=0;i--){
            reversed +=name.charAt(i);
        }

        String temp="";
        for(int i=0;i<reversed.length();i++){
            char ch=reversed.charAt(i);
            if(temp.indexOf(ch)==-1){
                temp+=ch;

            }
        }
System.out.println(temp);
    }

}
