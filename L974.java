//Subarray Sums Divisible by K

import java.util.Arrays;
class Solution {
    public int subarraysDivByK(int[] nums, int k) {

        //prefix sum topic
        int[] remCount = new int[k];
        int count = 0;
        int sum = 0;
        
        for (int num : nums) {
            sum = (sum + num) % k; // Update the running sum modulo k
            if (sum < 0) sum += k; // Ensure sum is non-negative
            count += remCount[sum]; // Add the count of subarrays with the same remainder
            if (sum == 0) count++; // If the sum itself is divisible by k, increment count
            remCount[sum]++; // Increment the count of subarrays with the current remainder
        }
        
        return count;
    }
}

