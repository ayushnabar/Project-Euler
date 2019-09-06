/*
 * Find the least number for which the proportion of bouncy numbers is exactly 99%.
 */
public class Euler112 {
	public static void main(String[] args) {
		int bouncy = 0;
		for(int i = 1; ; i++) {
			if(isBouncy(i)) {
				bouncy++;
			}
			if(bouncy*100==99*i) {
				System.out.println(i);
				break;
			}
		}
	}
	
	public static boolean isBouncy(long n) {
		String num = n + "";
		if(n<100) {
			return false;
		}

		boolean inc = true;
		boolean dec = true;
		for(int i = 0; i < num.length()-1; i++ ) {
			long first = n%10;
			n/=10;
			long second = n%10;
			if(second<first) {
				dec = false;
			}
			if(second>first) {
				inc = false;
			}
		}
		return !inc && !dec;
	}
}