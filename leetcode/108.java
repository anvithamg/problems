/*108. Convert Sorted Array to Binary Search Tree
Easy

Given an integer array nums where the elements are sorted in ascending order, convert it to a height-balanced binary search tree.

A height-balanced binary tree is a binary tree in which the depth of the two subtrees of every node never differs by more than one.

 

Example 1:

Input: nums = [-10,-3,0,5,9]
Output: [0,-3,9,-10,null,5]
Explanation: [0,-10,5,null,-3,null,9] is also accepted:

Example 2:

Input: nums = [1,3]
Output: [3,1]
Explanation: [1,3] and [3,1] are both a height-balanced BSTs.*/
/**
 * Definition for a binary tree node. public class TreeNode { int val; TreeNode
 * left; TreeNode right; TreeNode() {} TreeNode(int val) { this.val = val; }
 * TreeNode(int val, TreeNode left, TreeNode right) { this.val = val; this.left
 * = left; this.right = right; } }
 */
class Solution {
    public TreeNode builder(int[] nums, int start, int end) {
        if (start > end)
            return null;
        int mid = (start + end) / 2;
        return new TreeNode(nums[mid], builder(nums, start, mid - 1), builder(nums, mid + 1, end));

    }

    public TreeNode sortedArrayToBST(int[] nums) {
        return builder(nums, 0, nums.length - 1);
    }
}
