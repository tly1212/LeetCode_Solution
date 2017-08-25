
public class Heaters_475 {
	public static int findRadius(int[] houses, int[] heaters) {
		int len = houses.length;
		int sum = 0;
		int rad = 1;
		while (sum < len) {
			sum = 0;
			for (int e : heaters) {
				if (e < rad)
					sum += 2 * e + 1;
				else
					sum += 2 * rad + 1;
			}
			rad++;
		}
		return rad;
	}
	
	public static void main(String[] args) {
		int[] a = new int[10];
		int[] b = {1,4};
		int out = findRadius(a, b);
		System.out.println(out);
	}
}
