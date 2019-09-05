/*
 * Find the sum of all the primes below two million.
 */
public class Euler10 {
	public static boolean isPrime(long n) {
		for(int i = 2; i <= Math.sqrt(n); i++) {
			if(n%i==0) {
				return false;
			}
		}
		return true;
	}
	public static void main(String[] args) {
		long r = 2L;
		long sum = 0L;
		while(r<2000000) {
			if(isPrime(r)) {
				sum+=r;
			}
			r++;
		}
		System.out.println(sum);
		
	}
}
