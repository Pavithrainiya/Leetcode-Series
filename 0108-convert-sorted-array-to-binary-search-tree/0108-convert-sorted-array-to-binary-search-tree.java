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
    public TreeNode sortedArrayToBST(int[] nums) {
        if(nums.length==0) return null;
        return getbst(nums,0,nums.length-1);
        }
        public TreeNode getbst(int[]nums,int startIdx, int endIdx) {
            if(startIdx>endIdx) return null;
            int middleIdx=(startIdx+endIdx)/2;
            TreeNode bst=new TreeNode (nums[middleIdx]);
            bst.left=getbst(nums, startIdx,middleIdx-1);
            bst.right=getbst(nums,middleIdx+1,endIdx);
            return bst;
        }   
                    }