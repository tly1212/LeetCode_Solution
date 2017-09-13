import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * Given a binary tree, return the bottom-up level order traversal of its nodes'
 * values. (ie, from left to right, level by level from leaf to root).
 * 
 * solution comes from:
 * https://discuss.leetcode.com/topic/7651/my-dfs-and-bfs-java-solution/2
 * 
 * @author Liang-yu
 *
 */
public class Binary_Tree_Level_Order_Traversal_II_107 {

	// BFS

	public List<List<Integer>> levelOrderBottom(TreeNode root) {
		Queue<TreeNode> q = new LinkedList<TreeNode>();
		List<List<Integer>> out = new LinkedList<List<Integer>>();

		if (root == null)
			return out;

		q.offer(root);
		while (!q.isEmpty()) {
			int qsize = q.size();
			List<Integer> sublist = new LinkedList<Integer>();
			for (int i = 0; i < qsize; i++) {
				if (q.peek().left != null)
					q.offer(q.peek().left);
				if (q.peek().right != null)
					q.offer(q.peek().right);
				sublist.add(q.poll().val);
			}
			out.add(0, sublist);
		}
		return out;
	}

	// DFS
	public List<List<Integer>> levelOrderBottom2(TreeNode root) {
		List<List<Integer>> wrapList = new LinkedList<List<Integer>>();
		levelMaker(wrapList, root, 0);
		return wrapList;
	}

	public void levelMaker(List<List<Integer>> list, TreeNode root, int level) {
		if (root == null)
			return;
		if (level >= list.size()) {
			list.add(0, new LinkedList<Integer>());
		}
		levelMaker(list, root.left, level + 1);
		levelMaker(list, root.right, level + 1);
		list.get(list.size() - level - 1).add(root.val);
	}

}
