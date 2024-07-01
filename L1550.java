//Three Consecutive Odds

class Solution {
    public boolean threeConsecutiveOdds(int[] arr) {
        int ans = 0;
        for(int i = 0; i < arr.length; i++) {
            if(arr[i]%2 == 1) {
                ans++;
                if(ans==3) {
                    return true;
                }              
            }
            else {
                    ans = 0;
                } 
         }
         return false;
    }
}
