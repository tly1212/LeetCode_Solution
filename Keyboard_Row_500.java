import java.util.ArrayList;
import java.util.HashSet;

/**
 * Given a List of words, return the words that can be typed using letters of
 * alphabet on only one row's of American keyboard like the image below.
 * 
 * Note: You may use one character in the keyboard more than once. You may
 * assume the input string will only contain letters of alphabet.
 * 
 * @author Liang-yu
 *
 */
public class Keyboard_Row_500 {
	public static String[] findWords(String[] words) {
		ArrayList<String> ret = new ArrayList<String>();
		char[] r1 = { 'q', 'w', 'e', 'r', 't', 'y', 'u', 'i', 'o', 'p' };
		char[] r2 = { 'a', 's', 'd', 'f', 'g', 'h', 'j', 'k', 'l' };
		char[] r3 = { 'z', 'x', 'c', 'v', 'b', 'n', 'm' };
		HashSet<Character> s1 = new HashSet<Character>();
		HashSet<Character> s2 = new HashSet<Character>();
		HashSet<Character> s3 = new HashSet<Character>();
		for (char e : r1)
			s1.add(e);
		for (char e : r2)
			s2.add(e);
		for (char e : r3)
			s3.add(e);

		int i = 0;
		for (String e1 : words) {
			String e = e1.toLowerCase();
			char[] earr = e.toCharArray();
			HashSet<Character> copy;

			if (s1.contains(earr[0]))
				copy = s1;
			else if (s2.contains(earr[0]))
				copy = s2;
			else
				copy = s3;

			for (i = 0; i < earr.length; i++) {
				if (copy.contains(earr[i]))
					continue;
				else
					break;
			}
			if (i == earr.length)
				ret.add(e);
			i = 0;

		}

//		String[] aret = new String[ret.size()];
//		for (int j = 0; j < ret.size(); j++)
//			aret[j] = ret.get(j);
		//return aret;
		return ret.toArray(new String[0]);
	}
	
	public static void main(String[] args) {
		String[] s = {"Hello","Alaska","Dad","Peace"};
		String[] out = findWords(s);
	}
}
