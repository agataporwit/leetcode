/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public TreeNode invertTree(TreeNode root) {
        if (root == null) {
            return null;
        }
        
        TreeNode temp = root.left;
        root.left = invertTree(root.right);
        root.right = invertTree(temp);
        
        return root;
    }
}


/*
import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(4);
        root.left = new TreeNode(2);
        root.right = new TreeNode(7);
        root.left.left = new TreeNode(1);
        root.left.right = new TreeNode(3);
        root.right.left = new TreeNode(6);
        root.right.right = new TreeNode(9);

        Solution solution = new Solution();
        TreeNode invertedRoot = solution.invertTree(root);

        // Verify that the inverted tree is correct
        assert invertedRoot.val == 4;
        assert invertedRoot.left.val == 7;
        assert invertedRoot.right.val == 2;
        assert invertedRoot.left.left.val == 9;
        assert invertedRoot.left.right.val == 6;
        assert invertedRoot.right.left.val == 3;
        assert invertedRoot.right.right.val == 1;

        System.out.println("All test cases passed.");
    }
}


create a binary tree with 7 nodes and pass its root to the invertTree() method of the Solution class.
Then verify that the root and all its children have been inverted correctly using assert statements.
If all the assertions pass, we print a success message

**/
