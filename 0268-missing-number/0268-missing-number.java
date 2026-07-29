class Solution {
    public int missingNumber(int[] nums) {

        int i = 0;
        while(i < nums.length){
            int correct = nums[i];
            if(nums[i] < nums.length && nums[i] != nums[correct]){
                swap(nums, i, correct);
            }
            else{
                i++;
            }
        }

        for(int index = 0; index < nums.length; index++){
            if(nums[index] != index){
                return index;
            }
        }

        return nums.length;
    }

    static void swap(int[] arr, int num1, int num2){
        int temp = arr[num1];
        arr[num1] = arr[num2];
        arr[num2] = temp;
    }

}