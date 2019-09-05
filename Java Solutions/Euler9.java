/*
 * There exists exactly one Pythagorean triplet for which a+b+c=1000.
 * Find the product abc.
 */
public class Euler9 {
	public static void main(String[] args) {
		int a = 0;
		int b = 0;
		int c = 0; 
		for(int i = 1; i<1000; i++) {
			for(int j = 1; j<1000; j++) {
				a=i;
				b=j;
				c=1000-a-b;
				if((a*a)+(b*b)==(c*c)) {
					System.out.println(a*b*c);
					break;
				}
			}
		}
	}
}

