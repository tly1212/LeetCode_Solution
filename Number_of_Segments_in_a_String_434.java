
public class Number_of_Segments_in_a_String_434 {
	public static int countSegments(String s) {
		String[] a = ("a " + s).split("\\s+");
		return a.length - 1;
	}

	// online solution
	public int CountSegments2(String s) {
		if (s.length() == 0)
			return 0;
		int count = s.charAt(0) != ' ' ? 1 : 0;
		for (int i = 1; i < s.length(); i++) {
			// count the number of word starts
			count += s.charAt(i) != ' ' && s.charAt(i - 1) == ' ' ? 1 : 0;
		}
		return count;
	}

	public static void main(String[] args) {
		int a = countSegments(" Hello, my name is John");
		System.out.println(a);
	}
}
