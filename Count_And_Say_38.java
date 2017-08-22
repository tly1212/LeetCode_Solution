import java.util.ArrayList;

/**
 * @author Liang-yu The count-and-say sequence is the sequence of integers with
 *         the first five terms as following: 1. 1 2. 11 3. 21 4. 1211 5. 111221
 *         1 is read off as "one 1" or 11. 11 is read off as "two 1s" or 21. 21
 *         is read off as "one 2, then one 1" or 1211. Given an integer n,
 *         generate the nth term of the count-and-say sequence.
 */
public class Count_And_Say_38 {
	public static String countAndSay(int n) {
		int i = 1;
		ArrayList<Integer> a = new ArrayList<Integer>();
		if(n == 1)
			return "1";
		a.add(1);
		while(i < n){
			ArrayList<Integer> b = new ArrayList<Integer>();
			int j = 1, num = 1;
			while(j < a.size()){
				if(a.get(j) != a.get(j-1)){
					b.add(num);
					b.add(a.get(j-1));
					j++;
					num = 1;
				}
				else{
					j++;
					num++;
				}
				
			}
			i++;
			b.add(num);
			b.add(a.get(a.size()-1));
			a = b;
		}
		return a.toString();
	}
	public static void main(String[] args) {
		System.out.println(countAndSay(3));
	}
	
}
