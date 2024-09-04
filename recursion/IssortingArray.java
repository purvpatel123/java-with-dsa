//check the given array is sorted or not using recursive method
import java.util.*;
public class IssortingArray {
    public static boolean isSorted(int arr[],int i){
        if(i==arr.length-1){
          return true;
        }
        if(arr[i]>arr[i+1]){
            return false;
        }
        return isSorted(arr,i+1);
    }
    public static void main(String args[]){
        int arr[]={0,1,2,5,6};
        System.out.println(isSorted(arr,0));
    }
}



//9,9,9,9,9,9,9,7