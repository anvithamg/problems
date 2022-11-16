/*111. Minimum Depth of Binary Tree
Easy

5054

1037

Add to List

Share
Given a binary tree, find its minimum depth.

The minimum depth is the number of nodes along the shortest path from the root node down to the nearest leaf node.

Note: A leaf is a node with no children.

 

Example 1:


Input: root = [3,9,20,null,null,15,7]
Output: 2
Example 2:

Input: root = [2,null,3,null,4,null,5,null,6]
Output: 5*/
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
    public int minDepth(TreeNode root) {
        if(root == null) return 0;
        int l= depth(root.left);
        int r = depth(root.right);
        if((r!=0)&&(l==0)) return r+1;
        else if((l!=0)&&(r==0)) return l+1;
        else return Math.min(l,r)+1;
        
    }
    public int depth(TreeNode root){
        if(root == null) return 0;
        int ld = depth(root.left);
        int rd = depth(root.right);
        if((ld==0||rd==0)&&(ld!=rd)) return Math.abs(ld-rd)+1;
        else return Math.min(ld,rd)+1;
        
    }
}
