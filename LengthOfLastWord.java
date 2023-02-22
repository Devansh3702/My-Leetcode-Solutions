class Solution {
	public int lengthOfLastWord(String s) {
		char[] array = s.toCharArray();
		String word = "";
		String lastWord = "";
		for (char n : array) {
			if (n == ' ') {
				word = "";
			} 
			else {
				word += n;
				lastWord = word;
			}
		}
		return lastWord.length();
	}
}