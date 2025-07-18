import java.util.Scanner;

public class countVowelsConsonents {

   public static void main(String args[]){
       Scanner sc=new Scanner(System.in);
       System.out.println("enter the value of string");
int vowels=0;
int consonents=0;

     String Str= sc.nextLine();
     String lower=Str.toLowerCase();

     for(int i=0;i<=lower.length()-1;i++){
         char ch=Str.charAt(i);
         if(ch>='a' && ch<='z'){
             if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u'){
                 vowels++;

             }else{
                 consonents++;
             }
         }
         }
       System.out.println("vowels are" + vowels);
       System.out.println("consonents" + consonents);

   }

}
