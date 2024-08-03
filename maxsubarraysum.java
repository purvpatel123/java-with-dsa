//maximum sum from subarray
// kadane's algo
// it is not applicable when all number are negative
//time complexity is O(n)

public class maxsubarraysum {

    public static void kadanes(int numbers[]){
       int ms=Integer.MIN_VALUE;
       int currSum=0;

        for(int i=0;i<numbers.length;i++) {
            currSum = currSum + numbers[i];
            if (currSum < 0) {
                currSum = 0;
            }

            ms = Math.max(currSum, ms);



        }
            System.out.println("max subarray sum is :" +ms);

    }
    public static  void main(String args[]){
        int numbers[]={2,3,4,-1,7,-5,1,-4};
                kadanes(numbers);
    }
}
