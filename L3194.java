//Minimum Average of Smallest and Largest Elements

class Solution {
    public double minimumAverage(int[] nums) {
        //HashMap<Integer, Integer> avg = new HashMap<>(); 
        if(nums.length % 2 == 0){
            Arrays.sort(nums);
                        double minAverage = Double.MAX_VALUE;  // Initialize with the largest possible double value

            for (int i = 0; i < nums.length / 2; i++) {
                // Calculate the average of pairs from start and end
                double average = (nums[i] + nums[nums.length - 1 - i]) / 2.0;
                // Update minAverage if a smaller average is found
                minAverage = Math.min(minAverage, average);
            }
            return minAverage;
        }
        return -1;  // Return -1, if nums.length is odd
    }
}
