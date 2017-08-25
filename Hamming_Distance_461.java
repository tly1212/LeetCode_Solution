
public class Hamming_Distance_461 {
	public static int hammingDistance(int x, int y) {
		int diff = 0;
		char[] ax = Integer.toBinaryString(x).toCharArray();
		for(int i =0, j = ax.length -1; i<=j; i++,j--){
			char temp = ax[i];
			ax[i] = ax [j];
			ax[j] = temp;
		}
		char[] ay = Integer.toBinaryString(y).toCharArray();
		for(int i =0, j = ay.length -1; i<=j; i++,j--){
			char temp = ay[i];
			ay[i] = ay [j];
			ay[j] = temp;
		}
		for (int i = Math.max(ax.length, ay.length) - 1; i >= 0; i--) {
			char xi = i < ax.length ? ax[i] : '0';
			char yi = i < ay.length ? ay[i] : '0';
			if (xi != yi)
				diff++;
		}
		return diff;
	}

	public static void main(String[] args) {
		int out = hammingDistance(1, 4);
		System.out.println(out);
	}
}
