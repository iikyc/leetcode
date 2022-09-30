class Solution {
    public int maxSubArray(int[] nums) {
        int max_sum = nums[0];
        int current_sum = 0;
        for(int i = 0; i < nums.length; i++) {
            if(current_sum < 0) { 
                current_sum = 0;
            }
            current_sum += nums[i];
            max_sum = Math.max(max_sum, current_sum);
        }
        return max_sum;
    }
}
