import java.util.HashMap;

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
		// Time Limit Exceeded
		boolean same = false;
		if (ransomNote.length() == 0 && magazine.length() == 0)
			return true;
		else if (ransomNote.length() == 0)
			return true;
		else if (magazine.length() == 0)
			return false;
		char[] r = ransomNote.toCharArray();
		char[] m = magazine.toCharArray();
		int i = 0, j = 0;
		while (i < r.length && j < m.length) {
			if (r[i] == m[j]) {
				i++;
				j++;
				same = true;
			} else {
				if (!same) {
					i = 0;
					j++;
				} else {
					i = 0;
				}
			}
			if (i == r.length)
				return true;
		}
		return false;
	}

	//HashMap
	public boolean canConstruct2(String ransomNote, String magazine) {
		HashMap<Character, Integer> magM = new HashMap<>();
        for (char c:magazine.toCharArray()){
            int newCount = magM.getOrDefault(c, 0)+1;
            magM.put(c, newCount);
        }
        for (char c:ransomNote.toCharArray()){
            int newCount = magM.getOrDefault(c,0)-1;
            if (newCount<0)
                return false;
            magM.put(c, newCount);
        }
        return true;
    }
	
	//array
	 public boolean canConstruct3(String ransomNote, String magazine) {
	        int[] arr = new int[26];
	        for (int i = 0; i < magazine.length(); i++) {
	            arr[magazine.charAt(i) - 'a']++;
	        }
	        for (int i = 0; i < ransomNote.length(); i++) {
	            if(--arr[ransomNote.charAt(i)-'a'] < 0) {
	                return false;
	            }
	        }
	        return true;
	    }
}
