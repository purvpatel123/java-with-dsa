//find the first index of occur key

public class firstOccurence {
    public static int firstOccure(int i,int arr[],int key){
        if(i==arr.length){
            return -1;
        }
        if(arr[i]==key){
            return i;
        }
        return firstOccure(i+1,arr,key);
    }
    public static void main(String args[]){
        int arr[]={1,2,3,4,4,4,4,8};
        System.out.println(firstOccure(0,arr,4));
    }
}
