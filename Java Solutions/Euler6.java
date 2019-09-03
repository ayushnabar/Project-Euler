/*
 * Find the difference between the sum of the squares of the 
 * first one hundred natural numbers and the square of the sum.
 */
public class Euler6 {
	public static void main(String[] args) {
		long sum = 0;
		long sq = 0;
		for(int i = 0; i<101; i++) {
			sum+=i;
			sq+=(i*i);
		}
		System.out.println((sum*sum)-sq);
	}
	
}
