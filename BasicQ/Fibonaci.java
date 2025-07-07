public class Fibonaci {
     public static void fibonaci(int n){
         int first=0;
         int second=1;
         int next;

         System.out.print("Fibonacci series up to " + n + ": ");

         while (second<=n){
             System.out.print(first + " ");
             next=first+second;
             first=second;
             second=next;
         }
     }



    public static void main(String[] args){
        int n=5;
       fibonaci(n);
    }
}
