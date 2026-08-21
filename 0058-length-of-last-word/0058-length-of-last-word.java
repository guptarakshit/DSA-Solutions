class Solution {
    public int lengthOfLastWord(String s) {

        int lengthCount = 0;

        for(int i = s.length() - 1; i >= 0; i--){
            if(s.charAt(i) != ' '){
                lengthCount++;
            }
            else if(lengthCount > 0){
                return lengthCount;
            }
        }

        return lengthCount;
        
    }
}