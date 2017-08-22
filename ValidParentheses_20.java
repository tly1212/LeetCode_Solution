/*
Given a string containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.

The brackets must close in the correct order, "()" and "()[]{}" are all valid but "(]" and "([)]" are not.
*/
public class ValidParentheses_20 {
	public static boolean vp(String a) {
		char[] arr = a.toCharArray();
		if (arr.length %2 != 0)
			return false;
		int par = 0, curbra = 0, sqbra = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == '(')
				par++;
			else if (arr[i] == ')')
				par--;
			else if (arr[i] == '{')
				curbra++;
			else if (arr[i] == '}')
				curbra--;
			else if (arr[i] == '[')
				sqbra++;
			else if (arr[i] == ']')
				sqbra--;
			if (par < 0 || curbra < 0 || sqbra < 0)
				return false;
		}
		if (par == 0 && curbra == 0 && sqbra == 0)
			return true;
		else
			return false;
	}

	public static void main(String[] args) {
		String a = "(){}[()][]]";
		System.out.println(vp(a));
	}
}
