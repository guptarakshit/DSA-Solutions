class Solution {
    public boolean isAnagram(String s, String t) {

        int i = 0;
        boolean ans = true;

        char[] s1 = s.toCharArray();
        char[] t1 = t.toCharArray();

        if(s1.length == t1.length){
        Arrays.sort(s1);
        Arrays.sort(t1);
        }
        else{
            ans = false;
        }
       
        while(i < s1.length && i < t1.length){
            if(s1[i] == t1[i]){
               i++;
            }
            else{
                ans = false;
                break;
            }
            
        }
        
        return ans;
    
    }
}