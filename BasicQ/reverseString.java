public class reverseString {


      public static void main(String args[]){
                    String reverse="hello";
                    String reversed="";

                    for(int i=reverse.length()-1;i>=0;i--){
                        reversed += reverse.charAt(i);
                    }
          System.out.println("Reversed: " + reversed);
      }
}
