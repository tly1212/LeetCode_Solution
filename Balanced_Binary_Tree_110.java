
public class Balanced_Binary_Tree_110 {

	

	static int max = 0;

	public static boolean isBalanced(TreeNode root) {
		int diff = Math.abs(helper(root.right, 0) - helper(root.left, 0));
		if (diff > max)
			max = diff;
		if (max > 1)
			return false;
		return true;
	}

	public static int helper(TreeNode node, int height){
		if(node == null)
			return 0 + height;
		else {
			int diff = Math.abs(helper(node.right, height + 1) - helper(node.left, height + 1));
			if (diff > max)
				max = diff;
			return Math.max(helper(node.left, height + 1), helper(node.right, height + 1));
		}
	}
	
	public static void main(String[] args){
		TreeNode root = new TreeNode(5);
		root.left = new TreeNode(3);
		root.right = new TreeNode(6);
		root.left.left = new TreeNode(1);
		System.out.println(isBalanced(root));
	}
}


