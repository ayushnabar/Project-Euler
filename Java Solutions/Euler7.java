import java.util.ArrayList;

public class Euler7 {
	public static void main(String[] args) {
		int i = 2;
		int count = 0;
		while(count<10001) {
			if(isPrime(i)) {
				count++;
			}
			i++;
		}
		System.out.println(i-1);
	}
	public static boolean isPrime(int n) {
		for(int i = 2; i <= Math.sqrt(n); i++) {
			if(n%i==0) {
				return false;
			}
		}
		return true;
	}
}
