class Solution {
    public List<Integer> findDuplicates(int[] nums) {

        List<Integer> list = new ArrayList<>();

        int i = 0;
        while(i < nums.length){
            int correct = nums[i] - 1;
            if(nums[i] != nums[correct]){
                swap(nums, i, correct);
            }
            else{
                i++;
            }
        }

        for(int j = 0; j < nums.length; j++){
            if(nums[j] != j + 1){
                list.add(nums[j]);
            }
        }

        return list;
        
    }

    static void swap(int[] arr, int num1, int num2){
        int temp = arr[num1];
        arr[num1] = arr[num2];
        arr[num2] = temp;
    }
}