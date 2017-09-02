/**
 * Given a string, you need to reverse the order of characters in each word
 * within a sentence while still preserving whitespace and initial word order.
 * 
 * Example 1: Input: "Let's take LeetCode contest" Output:
 * "s'teL ekat edoCteeL tsetnoc"
 * 
 * Note: In the string, each word is separated by single space and there will
 * not be any extra space in the string.
 * 
 * @author Liang-yu
 *
 */
public class Reverse_Words_in_a_String_III_557 {
	 public String reverseWords(String s) {
	        StringBuilder sb1 = new StringBuilder();
	        StringBuilder sb2 = new StringBuilder();
	        char[] a = s.toCharArray();
	        for(int i = 0; i<a.length;i++){
	        	if(a[i] != ' '){
	        		sb1.append(a[i]);
	        	}else{
	        		sb2.append(sb1.reverse().toString());
	        		sb1.setLength(0);
	        		sb2.append(" ");
	        	}
	        }
	        sb2.append(sb1.reverse().toString());
	        return sb2.toString();
	 }
}
