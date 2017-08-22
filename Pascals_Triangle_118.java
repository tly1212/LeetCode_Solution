/**
 * Given numRows, generate the first numRows of Pascal's triangle.
 */
import java.util.ArrayList;
import java.util.List;

public class Pascals_Triangle_118 {
	public List<List<Integer>> generate(int numRows) {
		List<List<Integer>> result = new ArrayList<List<Integer>>();
		ArrayList<Integer> subarr = new ArrayList<Integer>();
		for (int i = 0; i < numRows; i++) {
			subarr.add(0, 1);
			for (int j = 1; j < subarr.size() - 1; j++)
				subarr.set(j, subarr.get(j) + subarr.get(j + 1));
			result.add(new ArrayList<Integer>(subarr));
		}
		return result;
	}
}
