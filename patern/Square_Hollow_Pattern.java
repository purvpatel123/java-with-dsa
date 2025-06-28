import java.util.*;
public class Square_Hollow_Pattern {

    public static void print(int n){

        //outer loop to handle row
        for(int i=0;i<n;i++){

            //inner loop to handle column
            for(int j=0;j<n;j++){



                if(i==0||j==0||i==n-1||j==n-1){
                    System.out.print('*');
                }else{
                    System.out.print(" ");
                }

            }
            System.out.println();
        }



    }





    public static void main(String args[]){
        int n=6;
        print(n);

    }
}
