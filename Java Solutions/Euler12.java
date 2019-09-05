import java.util.HashSet;
import java.util.Set;

/*
 * What is the value of the first triangle number to have over 
 * five hundred divisors?
 */
public class Euler12 {
	public static void main(String[] args) {
		long i = 1;
		long step = 2;
		while(countDivisors(i)<501) {
			i+=step;
			step++;
		}
		System.out.println(i);
	}
	public static int countDivisors(long n) {
		Set<Integer> ans = new HashSet<Integer>();
		for(int i = 1; i<=Math.sqrt(n); i++){
			if(n%i==0) {
				ans.add(i);
				ans.add((int) (n/i));
			}
		}
		return ans.size();
	}
}
