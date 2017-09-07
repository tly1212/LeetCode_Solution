// Determine whether an integer is a palindrome. Do this without extra space.
public class Palindrome_Number_9 {
	static boolean isPalindrome(int x) {
		if (x<0 || (x!=0 && x%10==0)) return false;
	    int rev = 0;
	    while (x>rev){
	    	rev = rev*10 + x%10;
	    	x = x/10;
	    }
	    return (x==rev || x==rev/10);
	}
	public boolean isPalindrome2(int x) {
	       StringBuilder sb = new StringBuilder();
	        sb.append(Integer.toString(x));
	        return (Integer.toString(x) == sb.reverse().toString());
	    }

	public static void main(String[] args) {
		int a = 21;
		System.out.println(isPalindrome(a));
	}
}
