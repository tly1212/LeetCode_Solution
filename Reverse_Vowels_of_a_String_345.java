/**
 * Write a function that takes a string as input and reverse only the vowels of
 * a string.
 * 
 * Example 1: Given s = "hello", return "holle".
 * 
 * Example 2: Given s = "leetcode", return "leotcede".
 * 
 * Note: The vowels does not include the letter "y".
 * 
 * @author Liang-yu
 *
 */
public class Reverse_Vowels_of_a_String_345 {
	public String reverseVowels(String s) {
		final String vowels = "aeiouAEIOU";
		int first = 0, last = s.length() - 1;
		char[] array = s.toCharArray();
		while (first < last) {
			while (first < last && vowels.indexOf(array[first]) == -1) {
				first++;
			}
			while (first < last && vowels.indexOf(array[last]) == -1) {
				last--;
			}
			char temp = array[first];
			array[first] = array[last];
			array[last] = temp;
			first++;
			last--;
		}
		return new String(array);
	}
}
