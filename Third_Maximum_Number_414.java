import java.util.PriorityQueue;

public class Third_Maximum_Number_414 {
	public static int thirdMax(int[] nums) {
		int out = 0;
		PriorityQueue<Integer> q = new PriorityQueue<Integer>();
		for (int e : nums)
			if (!q.contains(e))
				q.add(e);
		if (q.size() <= 2) {
			while (!q.isEmpty())
				out = q.poll();
			return out;
		} else {
			while (q.size() != 3)
				q.poll();
			return q.poll();
		}
	}

	public static void main(String[] args) {
		int[] b = { 2, 2, 3 };
		int a = thirdMax(b);
		System.out.println(a);
	}
}
