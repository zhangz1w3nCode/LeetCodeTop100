package SolutionList.HasPathSumI;

import SolutionList.BasicDataStruct.TreeNode;

class Solution {
    public boolean hasPathSumI(TreeNode root, int targetSum) {
        if(root==null) return false;
        return handle(root,targetSum);
    }
    public boolean handle(TreeNode root,int targetSum){
        if(root==null) return false;
        if(root.left==null&&root.right==null){
            return root.val==targetSum;
        }
        return handle(root.left,targetSum-root.val)||handle(root.right,targetSum-root.val);
    }
}
