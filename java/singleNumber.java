class Solution {
    public int singleNumber(int[] nums) {
        
        int i = 0;
        for (int j : nums){
            i = i ^ j;
        }
        
        return i;
        
    }
}
