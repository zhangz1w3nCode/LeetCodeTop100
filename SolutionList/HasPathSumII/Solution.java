package SolutionList.HasPathSumII;

import SolutionList.BasicDataStruct.TreeNode;
import java.util.ArrayList;
import java.util.List;

class Solution {
    List<List<Integer>> res = new ArrayList<>();
    List<Integer> path = new ArrayList<>();

    public List<List<Integer>> hasPathSumII(TreeNode root, int targetSum) {
        if (root == null) return res;
        handle(root, targetSum);
        return res;
    }

    public void handle(TreeNode root, int targetSum) {
        if (root == null) return;
        path.add(root.val);
        if (root.left == null && root.right == null) {
            if (targetSum == root.val) {
                res.add(new ArrayList<>(path));
            }
        }
        if (root.left != null) {
            handle(root.left, targetSum - root.val);
        }
        if (root.right != null) {
            handle(root.right, targetSum - root.val);
        }
        path.remove(path.size()-1);
    }
}
