class Solution {
    public int removeDuplicates(int[] nums) {

        int key = 0;

        for(int i = 1; i < nums.length; i++){
            if (nums[i] != nums[key]){
                key++;
                nums[key] = nums[i];
            }
        }

        return key+1;

        
    }
}