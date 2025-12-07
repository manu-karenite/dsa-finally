class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        int ans [] = {-1,-1};
        Map<Integer, Integer> m = new HashMap<>(nums.length);
        for (int i=0;i<nums.length;++i) {
            int diff = nums[i];
            if (m.containsKey(diff)) {
                ans[0] = i;
                ans[1] = m.get(diff);
                break;
            } else {
                m.put(target-nums[i],i);
            }
        }
       return ans;
    }
}
