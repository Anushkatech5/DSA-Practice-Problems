//Longest Continuous Subarray With Absolute Diff Less Than or Equal to Limit

class Solution {
    public int longestSubarray(int[] nums, int limit) {
        
        ArrayDeque<Integer> increase = new ArrayDeque<>();
        ArrayDeque<Integer> decrease = new ArrayDeque<>();

        int res = 0;
        int left = 0;

        for (int right = 0; right < nums.length; right++) {

            while (!increase.isEmpty() && increase.getLast()>nums[right]) {
                increase.removeLast();
            }
            while (!decrease.isEmpty() && decrease.getLast()<nums[right]) {
                decrease.removeLast();
            }
            increase.addLast(nums[right]);
            decrease.addLast(nums[right]);

            while (decrease.getFirst() - increase.getFirst() > limit) {
                if (nums[left] == decrease.getFirst()) {
                    decrease.removeFirst();
                }
                if (nums[left] == increase.getFirst()) {
                    increase.removeFirst();
                }
                left++;
            }

            int size = right - left + 1;
            res = Math.max(res, size);
        }

        return res;
    }
}
