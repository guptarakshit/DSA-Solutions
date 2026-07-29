class Solution {
    public int missingNumber(int[] nums) {

        Sort(nums);

        for(int index = 0; index < nums.length; index++){
            if(nums[index] != index){
                return index;
            }
        }

        return nums.length;
    }

    static void Sort(int[] arr){
        int i = 0;
        while(i < arr.length){
            int correct = arr[i];
            if(arr[i] < arr.length && arr[i] != arr[correct]){
                swap(arr, i, correct);
            }
            else{
                i++;
            }
        }
    }

    static void swap(int[] arr, int num1, int num2){
        int temp = arr[num1];
        arr[num1] = arr[num2];
        arr[num2] = temp;
    }

}