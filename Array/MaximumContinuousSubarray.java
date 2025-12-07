class MaximumContinuousSubarray {
    // Kadane's Algorithm
    public int maxSubArray(int[] nums) {
        int curr = nums[0];
        int global = nums[0];
        for (int i = 1; i<nums.length;++i){
            curr = Math.max(nums[i], curr+nums[i]); // extend or restart
            global = Math.max(curr,global);
        }
        return global;
    }
}
