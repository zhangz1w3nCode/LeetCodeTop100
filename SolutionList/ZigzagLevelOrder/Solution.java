package SolutionList.ZigzagLevelOrder;

import SolutionList.BasicDataStruct.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;


class Solution {
    List<List<Integer>> res = new ArrayList<>();
    Boolean flag = true;
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        if(root==null) return res;
        Queue<TreeNode> queue =new LinkedList<>();
        queue.add(root);
        while(!queue.isEmpty()){
            int size = queue.size();
            List<Integer> temp = new ArrayList<>();
            for(int i=0;i<size;++i){
                TreeNode node = queue.poll();
                if(flag){
                    temp.add(node.val);
                }else {
                    temp.add(0,node.val);
                }
                if(node.left!=null){
                    queue.add(node.left);
                }
                if(node.right!=null){
                    queue.add(node.right);
                }
            }
            res.add(temp);
            flag =!flag;
        }
        return res;
    }
}
