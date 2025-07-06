public class palindrome {
    public static void main(String[] args){
        String Str="rar";
        String reversed="";

        for(int i=Str.length()-1;i>=0;i--){
            reversed +=Str.charAt(i);
        }

        if(Str.equals(reversed)){
            System.out.println("taken string is palindrom");
        }else{
            System.out.println("not palindrom");
        }

    }
}
