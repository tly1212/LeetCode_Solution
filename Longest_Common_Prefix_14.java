//Write a function to find the longest common prefix string amongst an array of strings.
public class Longest_Common_Prefix_14 {
	public static String lcp(String[] a) {
		if (a.length == 0)
			return " ";
		String a0 = a[0];
		int i = 1, len = a.length;
		while (i < len) {
			while (!a[i].contains(a0)) {
				a0 = a0.substring(0, a0.length() - 1);
			}
			i++;
		}
		return a0;
	}

	public static void main(String[] args) {
		String[] a = { "thanks", "that" };
		System.out.println(lcp(a));
	}
}
