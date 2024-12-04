package SolutionList.Permute;

import java.util.ArrayList;
import java.util.List;

class Solution {
    List<List<Integer>> res = new ArrayList<>();
    List<Integer> path = new ArrayList<>();
    public List<List<Integer>> permute(int[] nums) {
        if(nums.length==0) return res;

        handle(nums);

        return res;
    }

    void handle(int[]nums){

        if(path.size()==nums.length){
            res.add(new ArrayList<>(path));
        }

        for(int num:nums){

            if(path.contains(num)){
                continue;
            }

            path.add(num);

            handle(nums);

            path.remove(path.size()-1);
        }

    }
}
