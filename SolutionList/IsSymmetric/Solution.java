package SolutionList.IsSymmetric;

import SolutionList.BasicDataStruct.TreeNode;

class Solution {
    public boolean isSymmetric(TreeNode root) {
        if(root==null) return false;
        return handle(root.left,root.right);
    }

    public boolean handle(TreeNode left,TreeNode right){
        if(left==null&&right==null) return true;
        if(left==null||right==null) return false;
        if(left.val!=right.val) return false;
        return handle(left.left,right.right)&&handle(left.right,right.left);
    }
}
