/**
 * Given a column title as appear in an Excel sheet, return its corresponding
 * column number.
 * 
 * For example:
 * 
 * A -> 1 B -> 2 C -> 3 ... Z -> 26 AA -> 27 AB -> 28
 * 
 * @author Liang-yu
 *
 */
public class Excel_Sheet_Column_Number_171 {
	public int titleToNumber(String s) {
		int out = 0;
		for(int i = 0; i < s.length(); i++){
			out = 26 *out + s.charAt(i) - 'A' +1;
		}
		return out;
	}
}
