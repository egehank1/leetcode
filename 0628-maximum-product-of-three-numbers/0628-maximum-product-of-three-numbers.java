class Solution {
    public int maximumProduct(int[] nums) {
         // Sort the array
        Arrays.sort(nums);

        // The maximum product can be either:
        // 1. The product of the three largest numbers (last three in sorted array)
        // 2. The product of the two smallest numbers (which could be negative) and the largest number
        int n = nums.length;
        int option1 = nums[n - 1] * nums[n - 2] * nums[n - 3];
        int option2 = nums[0] * nums[1] * nums[n - 1];

        return Math.max(option1, option2);
    }
}