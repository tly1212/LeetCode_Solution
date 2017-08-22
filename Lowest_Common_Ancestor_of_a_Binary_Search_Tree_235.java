/**
 * Given a binary search tree (BST), find the lowest common ancestor (LCA) of
 * two given nodes in the BST.
 * 
 * @author Liang-yu
 *
 */
public class Lowest_Common_Ancestor_of_a_Binary_Search_Tree_235 {
	//revursive
	public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if(root.val > p.val && root.val > q.val){
            return lowestCommonAncestor(root.left, p, q);
        }else if(root.val < p.val && root.val < q.val){
            return lowestCommonAncestor(root.right, p, q);
        }else{
            return root;
        }
    }
	
	//itarative
//	public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
//        while (true) {
//            if (root.val > p.val && root.val > q.val)
//                root = root.left;
//            else if (root.val < p.val && root.val < q.val)
//                root = root.right;
//            else
//                return root;
//        }
//    }
}
