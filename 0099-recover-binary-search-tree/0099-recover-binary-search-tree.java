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
    TreeNode first=null;
    TreeNode sec=null;
    TreeNode prev=null;
    public void recoverTree(TreeNode root) {
        inOrder(root);
        int temp=first.val;
        first.val=sec.val;
        sec.val=temp;

    }
    public void inOrder(TreeNode node){
        if(node==null) return;
        inOrder(node.left);
        if(prev!=null && prev.val>node.val){
          if(first==null){
            first=prev;
          }
          sec=node;
        }
        else{
            prev=node;
        }
        inOrder(node.right);
    }
}