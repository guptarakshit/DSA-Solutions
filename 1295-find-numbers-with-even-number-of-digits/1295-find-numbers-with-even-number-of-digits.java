class Solution {
    public int findNumbers(int[] nums) {

        int evenCount = 0;

        

        for(int i = 0; i < nums.length; i++){
            ArrayList<Integer> individual = new ArrayList<>();
            while(nums[i] > 0){
                int num  = nums[i];
                int a = nums[i] % 10;
                nums[i] = num/10;
                individual.add(a);
            }
            if (individual.size() % 2 == 0){
                evenCount++;
            }
        }
        return evenCount;
        
    }
}