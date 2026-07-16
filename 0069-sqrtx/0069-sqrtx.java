class Solution {
    public int mySqrt(int x) {
        
        int start = 0;
        int end = x;
        int mid = 0;

        while(start <= end){
            mid = start + (end - start)/2;
            if(x > ((long)mid*mid)){
                start = mid+1;
            }
            else if(x < ((long)mid*mid)){
                end = mid - 1;
            }
            else{
                return mid;
            }
        }

        return end;

    }
}