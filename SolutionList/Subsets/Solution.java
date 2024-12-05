package SolutionList.Subsets;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Solution {
    /*
    给你一个整数数组nums 数组中的元素互不相同 返回该数组所有可能的子集
    解集不能包含重复的子集 你可以按任意顺序返回解集
     */
    List<List<Integer>> res = new ArrayList<>();
    List<Integer> path = new ArrayList<>();

    public List<List<Integer>> subsets(int[] nums) {
        if (nums.length == 0) return res;
        handle(nums,0);
        return res;
    }

    public void handle(int[]nums,int idx){
        res.add(new ArrayList<>(path));
        for(int i=idx;i<nums.length;++i){
            path.add(nums[i]);
            handle(nums,i+1);
            path.remove(path.size()-1);
        }
    }
}