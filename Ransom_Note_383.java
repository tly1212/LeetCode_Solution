/**
 * Given an arbitrary ransom note string and another string containing letters
 * from all the magazines, write a function that will return true if the ransom
 * note can be constructed from the magazines ; otherwise, it will return false.
 * 
 * Each letter in the magazine string can only be used once in your ransom note.
 * canConstruct("a", "b") -> false canConstruct("aa", "ab") -> false
 * canConstruct("aa", "aab") -> true
 * 
 * @author Liang-yu
 *
 */
public class Ransom_Note_383 {
	public static boolean canConstruct(String ransomNote, String magazine) {
		char[] r = ransomNote.toCharArray();
		char[] m = magazine.toCharArray();
		int i = 0, j = 0;
		while(i < r.length && j < m.length){
			if(r[i]  == m[j]){
				i++;
				j++;
			}else{
				i = 0;
				j++;
			}
			if(i == r.length)
				return true;
		}
		return false;
	}
	
	public static void main(String[] args){
		boolean out = canConstruct("aa", "aab");
		System.out.println(out);
	}
}
