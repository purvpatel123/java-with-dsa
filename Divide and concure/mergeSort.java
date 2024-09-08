import java.util.*;
public class mergeSort {
    public static void printArr(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void mergesort(int arr[],int si,int ei){
           if(si>=ei){
               return;
           }
           int mid=(si+ei)/2;
           //for left side
           mergesort(arr,si,mid);
           //for right side
        mergesort(arr,mid+1,ei);
        merge(arr,si,mid,ei);

    }
    //merge method to merge the sorted array
    public static void merge(int arr[],int si,int mid,int ei) {
        int temp[] = new int[(ei-si + 1)];
        int i = si;//idx for first sorted array
        int j = mid + 1;//idx for second sorted array
        int k = 0;//idx for temp

        while (i <= mid && j <= ei) {
            if (arr[i] < arr[j]) {
                temp[k] = arr[i];
                i++;
            } else {
                temp[k] = arr[j];
                j++;
            }
            k++;//temp arr increment in any case

        }
        while (i <= mid) {
            temp[k++] = arr[i++];
        }
        while (j <= ei) {
            temp[k++] = arr[j++];
        }
        //copy temp to original array

        for (k = 0, i = si; k < temp.length; k++, i++) {
            arr[i] = temp[k];
        }
    }
        public static void main (String args[]){
            int arr[] = {2, 4, 6, 1, 3, 9, 7};
            mergesort(arr,0,arr.length-1);
            printArr(arr);
        }
    }
