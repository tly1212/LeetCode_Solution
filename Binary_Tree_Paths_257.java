import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * Given a binary tree, return all root-to-leaf paths.
 * 
 * For example, given the following binary tree
 * 
 * @author Liang-yu
 *
 */


public class Binary_Tree_Paths_257 {
	
	// method 1. not so efficiency
	// public List<String> binaryTreePaths(TreeNode root) {
	// List<String> paths = new LinkedList<>();
	//
	// if (root == null)
	// return paths;
	//
	// if (root.left == null && root.right == null) {
	// paths.add(root.val + "");
	// return paths;
	// }
	//
	// for (String path : binaryTreePaths(root.left)) {
	// paths.add(root.val + "->" + path);
	// }
	//
	// for (String path : binaryTreePaths(root.right)) {
	// paths.add(root.val + "->" + path);
	// }
	//
	// return paths;
	// }
	
	
	// method 2.  the discussion is very helpful, go through it.
	public List<String> binaryTreePaths(TreeNode root) {
	    List<String> answer = new ArrayList<String>();
	    if (root != null) searchBT(root, "", answer);
	    return answer;
	}
	private void searchBT(TreeNode root, String path, List<String> answer) {
	    if (root.left == null && root.right == null) answer.add(path + root.val);
	    if (root.left != null) searchBT(root.left, path + root.val + "->", answer);
	    if (root.right != null) searchBT(root.right, path + root.val + "->", answer);
	}
}
