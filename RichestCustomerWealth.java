class Solution {
    public int maximumWealth(int[][] accounts) {
        int maxWealthSoFar=0;

        for(int[] customer : accounts){
        int CurrentCustomerWealth=0;
        

        for(int bank : customer){
        CurrentCustomerWealth += bank;
        }
        maxWealthSoFar= Math.max(maxWealthSoFar,CurrentCustomerWealth);
    }
    return maxWealthSoFar ;
    }
}
