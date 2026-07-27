class Solution {
    public int maxProduct(int[] nums) {
        
        int max = 0; 
        int second = 0;
        int maxIndex = 0;

        for(int i = 0; i < nums.length; i++){
            if(nums[i] > max){
                max = nums[i];
                maxIndex = i;
            }
        }

        for(int j = 0; j < nums.length; j++){
            if(j != maxIndex && nums[j] > second){
                second = nums[j];
            }
        }

        return (max-1)*(second-1);
    }
}