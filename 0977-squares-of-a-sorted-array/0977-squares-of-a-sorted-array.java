import java.util.ArrayList;
class Solution {
    public int[] sortedSquares(int[] nums) {

        int[] SQnumbers = new int[nums.length]; 

        for(int i = 0; i < nums.length; i++){
            SQnumbers[i] = nums[i]*nums[i];
        }

        insertionSort(SQnumbers);

        return SQnumbers;
    }

    static void insertionSort(int[] arr){
        for (int i = 0; i < arr.length - 1; i++) {
            for(int j = i+1; j > 0; j--){
                if(arr[j] < arr[j-1]) {
                    int temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                }else{
                    break;
                }
            }
        }
 
    }
}        