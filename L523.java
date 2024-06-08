//Continuous Subarray Sum

import java.util.HashMap;

class Solution {
    public boolean checkSubarraySum(int[] nums, int k) {
        HashMap<Integer, Integer> remainderMap = new HashMap<>();
        remainderMap.put(0, -1); // Initialize the map with 0 remainder at index -1 (to handle subarrays starting from index 0)

        int runningSum = 0;
        for (int i = 0; i < nums.length; i++) {
            runningSum += nums[i];
            if (k != 0) // Ensure k is not 0 to avoid division by zero
                runningSum %= k;

            if (remainderMap.containsKey(runningSum)) {
                int prevIndex = remainderMap.get(runningSum);
                if (i - prevIndex >= 2)
                    return true;
            } else {
                remainderMap.put(runningSum, i);
            }
        }

        return false;
    }
}
