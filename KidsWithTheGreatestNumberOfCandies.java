import java.util.ArrayList;
import java.util.List;

class Solution {
	public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
		int max = findMax(candies);

		List<Boolean> returnVal = new ArrayList<>();

		for (int i = 0; i < candies.length; i++) {
			if ((candies[i] + extraCandies) >= max) {
				returnVal.add(true);
			} else {
				returnVal.add(false);
			}
		}
		return returnVal;
	}

	public static int findMax(int[] values) {
		int max = 0;
		for (int i = 0; i < values.length; i++) {
			if (values[i] > max) {
				max = values[i];
			}
		}
		return max;
	}
}