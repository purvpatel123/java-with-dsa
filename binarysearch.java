//binary search
import java.util.*;
public class binarysearch {
    public static int Binarysearchof(int numbers[], int key){
        int start=0; int end=numbers.length-1;
        while(start<=end){
           int mid=(start+end)/2;
           if(numbers[mid]==key){
               return key;

            }
           if(numbers[mid]>key){
               end=mid-1;
           }else{
               start=mid+1;
           }

        }
        return -1;

    }
    public static void main(String[] args){
        int numbers[]={2,4,6,8,10,12};
        int key=4;
        System.out.println("index for key is:" +Binarysearchof(numbers,key));
    }
}
