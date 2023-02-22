class Solution {
	public boolean isPalindrome(int x) {
		System.out.println(x);
		String x2 = Integer.toString(x);
		char[] array = x2.toCharArray();
		int arraySize = array.length;
		for (int i = 0; i < arraySize; i++) {
			if (array[i] != array[arraySize - 1 - i]) {
				return false;
			}
			;
		}

		return true;
	}
}