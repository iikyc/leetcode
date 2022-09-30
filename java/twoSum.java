import java.util.HashMap

class Solution {
    public int[] twoSum(int[] nums, int target) {
        
	HashMap<Integer, Integer> complements = new HashMap<>();
        
	for(int i = 0; i < nums.length; i++) {
            Integer indexOfComplement = complements.get(nums[i]);
            if(indexOfComplement != null) {
                return new int[]{i, indexOfComplement};
            }
            complements.put(target - nums[i], i);
        }
        return nums;
    
    }
}
