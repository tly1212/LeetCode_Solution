import java.util.ArrayList;
import java.util.List;

public class Arranging_Coins_441 {
	// Binary search method
	public static int arrangeCoins(int n) {
		int begin = 0;
		int end = n;
		int mid = begin + (end - begin) / 2;
		while (begin <= end) {
			if (mid * (mid + 1) / 2 == n)
				return mid;
			else if (mid * (mid + 1) / 2 < n) {
				begin = mid + 1;
				mid = begin + (end - begin) / 2;
			} else {
				end = mid - 1;
				mid = begin + (end - begin) / 2;
			}
		}

		return begin -1;
	}
	
	public static int arrangeCoins2(int n){
		return (int)(Math.sqrt(2*n + 0.25) - 0.5);
	}

	public static void main(String[] args) {
		int a = arrangeCoins2(5);
		System.out.println(a);
	}
}
