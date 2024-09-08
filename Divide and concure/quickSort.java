//quick sort

import java.util.*;
public class quickSort {
    public static void printArray(int arr[]){        //for printing array
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    public static void quick(int arr[],int si,int ei) {
        if (si >= ei) {
            return;
        }
        int pIDX = partition(arr,si, ei);
        quick(arr, si, pIDX - 1);//left
        quick(arr, pIDX + 1, ei);//right

    }
    public static int partition(int arr[],int si,int ei){
         int pivot=arr[ei];  //here we chose last element of array as a pivot.(we can chose any)
         int i=si-1; //starting index of i is -1.
          for(int j=si;j<ei;j++){
              if(arr[j]<pivot){
                  i++;   //make a space
                   //swap
                  int temp=arr[j];
                  arr[j]=arr[i];
                  arr[i]=temp;
              }
          }

          //for place pivot in currect place
               i++;
          int temp=pivot;
          arr[ei]=arr[i];
          arr[i]=temp;
          return i;


    }
    public static void main(String args[]){
        int arr[]={1,2,5,7,3,9,4};
        quick(arr,0,arr.length-1);
        printArray(arr);
    }
}
