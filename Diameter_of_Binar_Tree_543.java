/**
 * Given a binary tree, you need to compute the length of the diameter of the
 * tree. The diameter of a binary tree is the length of the longest path between
 * any two nodes in a tree. This path may or may not pass through the root.
 * 
 * @author Liang-yu
 *
 */
public class Diameter_of_Binar_Tree_543 {
	int ret = 0;

	public int diameterOfBinaryTree(TreeNode root) {
		max(root);
		return ret;
	}

	public int max(TreeNode node) {
		int lef = 0;
		int rig = 0;
		if (node == null)
			return 0;
		if (node.left != null)
			lef = max(node.left) + 1;
		if (node.right != null)
			rig = max(node.right) + 1;
		if (ret < lef + rig)
			ret = lef + rig;
		return Math.max(lef, rig);

	}
}
