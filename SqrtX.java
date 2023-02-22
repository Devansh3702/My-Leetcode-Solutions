public class Solution {
	public static int mySqrt(int x) {
		if (x < 0) {
			x *= -1;
		}
		boolean a = false;
		long b = 0;
		while (!a) {
			if ((b + 1) * (b + 1) > x) {
				a = true;

			} 
			else {
				b++;
			}
		}
		return (int) b;
	}

}