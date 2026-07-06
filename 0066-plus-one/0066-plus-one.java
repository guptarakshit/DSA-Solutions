class Solution {
    public int[] plusOne(int[] digits) {

        for(int j = digits.length - 1; j >= 0; j--){
            
            if(digits[j] != 9){
                digits[j] = digits[j] + 1;
                return digits;
            }
            else if(digits[j] == 9){
                digits[j] = 0;
            }   
        
        }

        int[] ans = new int[digits.length + 1];
        ans[0] = 1;
        return ans;

    }

}