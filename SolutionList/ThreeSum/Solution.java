package SolutionList.ThreeSum;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        int len = nums.length;
        if (len < 3) return res;

        Arrays.sort(nums);

        for (int i = 0; i < len; ++i) {
            if (i == 0 && nums[i] > 0) break;
            if (i >= 1 && nums[i - 1] == nums[i]) continue;

            int l = i + 1;
            int r = len - 1;

            while (l<r){
                int sum = nums[i] + nums[l] + nums[r];
                if (sum == 0) {
                    res.add(new ArrayList<>(Arrays.asList(nums[i], nums[l], nums[r])));
                    while (l<r&&nums[l]==nums[l+1]) {
                        ++l;
                    }
                    while (l<r&&nums[r]==nums[r-1]) {
                        --r;
                    }
                    ++l;
                    --r;
                } else if (sum > 0) {
                    --r;
                } else {
                    ++l;
                }
            }
        }

        return res;
    }
}
