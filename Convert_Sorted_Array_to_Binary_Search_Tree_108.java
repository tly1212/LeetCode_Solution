/**
 * Given an array where elements are sorted in ascending order, convert it to a
 * height balanced BST.
 * 
 * solution comes from:
 * https://leetcode.com/problems/convert-sorted-array-to-binary-search-tree/#/
 * description
 * 
 * @author Liang-yu
 *
 */
public class Convert_Sorted_Array_to_Binary_Search_Tree_108 {
	public class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;

		TreeNode(int x) {
			val = x;
		}

		public TreeNode sortedArrayToBST(int[] num) {
			if (num.length == 0) {
				return null;
			}
			TreeNode head = helper(num, 0, num.length - 1);
			return head;
		}

		public TreeNode helper(int[] num, int low, int high) {
			if (low > high) { // Done
				return null;
			}
			int mid = (low + high) / 2;
			TreeNode node = new TreeNode(num[mid]);
			node.left = helper(num, low, mid - 1);
			node.right = helper(num, mid + 1, high);
			return node;
		}
	}
}
