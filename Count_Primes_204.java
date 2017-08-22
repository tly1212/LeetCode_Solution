/**
 * Count the number of prime numbers less than a non-negative number, n.
 * 
 * @author Liang-yu
 *
 */
public class Count_Primes_204 {
	public static int countPrimes(int n) {			
		boolean[] notPrime = new boolean[n];
		int count = 0;
		for (int i = 2; i < n; i++) {
			if (notPrime[i] == false) {
				count++;
				for (int j = 2; i * j < n; j++) {
					notPrime[i * j] = true;
				}
			}
		}

		return count;	
	}
	
	public static void main(String[] args){
		int a = countPrimes(100000);
		System.out.println(a);
	}
}
