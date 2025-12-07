class Sort012 {
    // Dutch National Flag Algorithm
    private void swap(int[] nums, int f, int g) {
        int prev = nums[f];
        nums[f] = nums[g];
        nums[g]= prev;
    }
    public void sortColors(int[] nums) {
        int n = nums.length;
        if (n ==1) return;
        if (n == 2) {
            int mini = Math.min(nums[0], nums[1]);
            int maxi = Math.max(nums[0], nums[1]);
            nums[0] = mini;
            nums[1] = maxi;
            return;
        }
        int l = 0;
        int m = 0;
        int r = n-1;
        while (m<=r) {
            int curr = nums[m];
            if(curr == 1 ){
                ++m;
            } else if (curr == 0 ){
                swap(nums,l,m);
                ++l;
                ++m;
            } else {
                swap(nums,r,m);
                --r;
            }
        }    
    }
}
