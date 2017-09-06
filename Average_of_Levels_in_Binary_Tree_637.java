import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * Given a non-empty binary tree, return the average value of the nodes on each
 * level in the form of an array.
 * 
 * @author Liang-yu
 *
 */
public class Average_of_Levels_in_Binary_Tree_637 {
	public List<Double> averageOfLevels(TreeNode root) {
		ArrayList<Double> ret = new ArrayList<>();
		Double sum;
		int size;
		TreeNode temp;
		Stack<TreeNode> s1 = new Stack<>();
		Stack<TreeNode> s2 = new Stack<>();

		s1.push(root);

		while (!s1.isEmpty() || !s2.isEmpty()) {
			sum = 0.0;
			temp = null;
			size = Math.max(s1.size(), s2.size());
			if (!s1.isEmpty()) {
				while (!s1.isEmpty()) {
					temp = s1.pop();
					sum += temp.val;
					if (temp.left != null)
						s2.push(temp.left);
					if (temp.right != null)
						s2.push(temp.right);
				}
				ret.add(sum / size);
			} else {
				while (!s2.isEmpty()) {
					temp = s2.pop();
					sum += temp.val;
					if (temp.left != null)
						s1.push(temp.left);
					if (temp.right != null)
						s1.push(temp.right);
				}
				ret.add(sum / size);
			}
		}
		return ret;
	}
}
