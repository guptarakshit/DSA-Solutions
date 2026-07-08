class Solution {
    public int[] twoSum(int[] nums, int target) {

        int[] ans = null;

        for(int i = 0; i < nums.length; i++){
            for(int j = nums.length - 1; j > i; j--){
                if(nums[i] + nums[j] == target){
                    ans = new int[]{i,j};
                    return ans;
                }
            }
        }

        return ans;
        
    }
}