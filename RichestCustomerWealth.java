class Solution {
	public int maximumWealth(int[][] accounts) {
		int returnVal = 0;

		int rows = accounts.length;
		int cols = accounts[0].length;

		for (int i = 0; i < rows; i++) {
			int currentCustomerVal = 0;
			for (int j = 0; j < cols; j++) {
				currentCustomerVal += accounts[i][j];
			}
			if (returnVal < currentCustomerVal) {
				returnVal = currentCustomerVal;
			}
		}
		return returnVal;
	}
}
