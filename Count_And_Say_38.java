import java.util.ArrayList;

/**
 * 
 * @author Liang-yu
 *
 */
public class Count_And_Say_38 {
	public String countAndSay(int n) {
		int i = 1;
		ArrayList<Integer> a = new ArrayList<Integer>();
		if (n == 1)
			return "1";
		a.add(1);
		while (i < n) {
			ArrayList<Integer> b = new ArrayList<Integer>();
			int j = 1, num = 1;
			while (j < a.size()) {
				if (a.get(j) != a.get(j - 1)) {
					b.add(num);
					b.add(a.get(j - 1));
					j++;
					num = 1;
				} else {
					j++;
					num++;
				}

			}
			i++;
			b.add(num);
			b.add(a.get(a.size() - 1));
			a = b;
		}
		StringBuilder sb = new StringBuilder();
		for (int j = 0; j < a.size(); j++)
			sb.append(a.get(j));
		return sb.toString();
	}
}
