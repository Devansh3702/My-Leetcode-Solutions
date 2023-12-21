import java.util.HashMap;

// Fully optimized
// Space: O(n)
// Time : O(n)
class Solution {
	public int[] twoSum(int[] nums, int target) {
		HashMap<Integer, Integer> map = new HashMap<>();
		int[] retVal = new int[2];
		
		for(int i = 0; i < nums.length; i++) {
			if(map.containsKey(target - nums[i])) {
				retVal[0] = i;
				retVal[1] = map.get(target - nums[i]);
				return retVal;
			}
			map.put(nums[i], i);
		}
		
		return retVal;
	}
}