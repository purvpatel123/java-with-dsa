//find the last occurence of given key
import java.util.*;

public class lastOccurence {
    public static int lastOccure(int i,int arr[],int key){
        if(i==arr.length){
            return -1;
        }
        int isFouund=lastOccure(i+1,arr,key);
        if(isFouund !=-1){
            return isFouund;
        }
        if(arr[i]==key){
            return i;
        }
return isFouund;
    }
    public static void main(String args[]){
        int arr[]={1,2,3,1,1,1,1,1,1};
        System.out.println(lastOccure(0,arr,1));
    }
}
