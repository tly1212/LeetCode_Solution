import java.util.ArrayList;
import java.util.List;

/**
 * Given an index k, return the kth row of the Pascal's triangle.
 * 
 * For example, given k = 3, Return [1,3,3,1].
 * 
 * @author Liang-yu
 *
 */
public class Pascals_Triangle_II_119 {
	public List<Integer> getRow(int rowIndex) {
		rowIndex++; // rowIndex starts from 0
		ArrayList<Integer> subarr = new ArrayList<Integer>();
		for (int i = 0; i < rowIndex; i++) {
			subarr.add(0, 1);
			for (int j = 1; j < subarr.size() - 1; j++)
				subarr.set(j, subarr.get(j) + subarr.get(j + 1));
		}
		return subarr;
	}
}
